package com.kh.springhome.controller;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.springhome.constant.SessionConstant;
import com.kh.springhome.entity.BoardDto;
import com.kh.springhome.entity.ReplyDto;
import com.kh.springhome.error.TargetNotFoundException;
import com.kh.springhome.repository.BoardDao;
import com.kh.springhome.repository.ReplyDao;
import com.kh.springhome.vo.BoardListSearchVO;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardDao boardDao;
	@Autowired
	private ReplyDao replyDao;
	
//	참고 : ModelAttribute로 수신한 데이터는 자동으로 Model에 첨부된다
//	- 옵션에 name을 작성하면 해당하는 이름으로 model에 첨부
	@GetMapping("/list")
	public String list(Model model,
			@ModelAttribute(name="vo") BoardListSearchVO vo) {
		//페이지 네비케이터를 위한 게시글 수를 구한다.
		int count = boardDao.count(vo);
		vo.setCount(count);
		model.addAttribute("list", boardDao.selectList(vo));
//		return "/WEB-INF/views/board/list.jsp";
		return "board/list";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model,
			HttpSession session) {
//		1. 조회수 증가시켜서 데이터를 불러온다
//		boardDao.updateReadcount(boardNo);
//		model.addAttribute("boardDto", boardDao.selectOne(boardNo));
		
//		2. 데이터를 읽도록 처리한다
//		model.addAttribute("boardDto", boardDao.read(boardNo));
		
		//(+추가) 조회수 중복 방지 처리
		//(1) 세션에 내가 읽은 게시글의 번호를 저장할 수 있는 저장소를 구현
		// -> 후보 : int[], List<Integer>, Set<Integer>
		// -> 현재 필요한 것은 게시글을 읽은 적이 있는가(중복확인)
		// -> 세션에 저장할 이름은 history로 지정
		//(2) 현재 history가 있을지 없을지 모르므로 꺼내서 없으면 생성
		
		Set<Integer> history = (Set<Integer>)session.getAttribute("history");
		if(history == null) { //history가 없다면 신규생성
			history = new HashSet<>();
		}
		
		// (3) 현재 글 번호를 읽은 적이 있는지 검사
		if(history.add(boardNo)) {// 추가된 경우 - 처음 읽는 번호
			model.addAttribute("boardDto", boardDao.read(boardNo));
		}else {
			model.addAttribute("boardDto", boardDao.selectOne(boardNo));
		}
		model.addAttribute("replyDto");
		//(4) 갱신된 저장소를 세션에 다시 저장
		session.setAttribute("history", history);
		
//		(+추가) 댓글 목록을 조회하여 첨부
		model.addAttribute("replyList", replyDao.selectList(boardNo));
		
		return "board/detail";
	}
	
	@GetMapping("/write")
	public String write() {
		return "board/write";
	}
	
	@PostMapping("/write")
	public String write(
			@ModelAttribute BoardDto boardDto,
			HttpSession session, RedirectAttributes attr) {
//		session에 있는 회원 아이디를 작성자로 추가한 뒤 등록해야함
//		String memberId = (String)session.getAttribute("loginId");
		String memberId = (String)session.getAttribute(SessionConstant.ID);
		boardDto.setBoardWriter(memberId);
		
//		boardDao.insert(boardDto);
//		return "redirect:list";
		
//		등록될 글의 번호를 미리생성
		int boardNo = boardDao.sequence();
		boardDto.setBoardNo(boardNo);
		
//		등록 전에 "새글"인지 "답글"인지 파악해서 그에 맞는 계산을 수행
		if(boardDto.getBoardParent() == 0) { // 새글
			boardDto.setBoardGroup(boardNo);
			boardDto.setBoardParent(0);
			boardDto.setBoardDepth(0);
		}else { // 답글
			BoardDto parentDto = boardDao.selectOne(boardDto.getBoardParent());
			boardDto.setBoardGroup(parentDto.getBoardGroup());
			boardDto.setBoardDepth(parentDto.getBoardDepth()+1);
		}
		
//		문제점 : 등록은 되는데 몇 번인지 알 수 없다
//		해결책 : 번호를 미리 생성하고 등록하도록 메소드 변경
		boardDao.insert2(boardDto);
		attr.addAttribute("boardNo", boardNo);
		return "redirect:detail";
	}
	
	@PostMapping("/reply/write")
	public String replyWrite(@ModelAttribute ReplyDto replyDto,
			RedirectAttributes attr, HttpSession session) {
		String memberId = (String)session.getAttribute(SessionConstant.ID);
		replyDto.setReplyWriter(memberId);
		replyDao.insert(replyDto);
		attr.addAttribute("boardNo", replyDto.getReplyOrigin());
//		return "redirect:../detail"; 상대
		return "redirect:/board/detail"; //절대
	}
	@GetMapping("/reply/delete")
	public String replyDelete(@RequestParam int replyNo, 
			@RequestParam int replyOrigin,
			RedirectAttributes attr) {
		replyDao.delete(replyNo);
		attr.addAttribute("boardNo", replyOrigin);
		return "redirect:/board/detail";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		boolean result = boardDao.delete(boardNo);
		if(result) {//성공
			return "redirect:list";
		}
		else {//구문은 실행되었지만 바뀐 게 없는 경우(강제 예외 처리)
			throw new TargetNotFoundException();
		}
	}
	@GetMapping("/edit")
	public String edit(@RequestParam int boardNo, 
			Model model) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		if(boardDto == null) {
			throw new TargetNotFoundException();
		}
		model.addAttribute("boardDto", boardDto);
		return "board/edit";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto boardDto,
			RedirectAttributes attr) {
		boolean result = boardDao.update(boardDto);
		if(result) {
			attr.addAttribute("boardNo", boardDto.getBoardNo());
			return "redirect:detail";
		}else {			
			throw new TargetNotFoundException();
		}
	}
	
}
