package com.kh.springhome.controller;

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
import com.kh.springhome.error.TargetNotFoundException;
import com.kh.springhome.repository.BoardDao;
import com.kh.springhome.vo.BoardListSearchVO;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardDao boardDao;
	
//	참고 : ModelAttribute로 수신한 데이터는 자동으로 Model에 첨부된다
//	- 옵션에 name을 작성하면 해당하는 이름으로 model에 첨부
	@GetMapping("/list")
	public String list(Model model,
			@ModelAttribute(name="vo") BoardListSearchVO vo) {
		if(vo.isSearch()) {
			model.addAttribute("list", boardDao.selectList(vo));
		}
		else{
			model.addAttribute("list", boardDao.selectList());
		}
//		return "/WEB-INF/views/board/list.jsp";
		return "board/list";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model) {
//		1. 조회수 증가시켜서 데이터를 불러온다
//		boardDao.updateReadcount(boardNo);
//		model.addAttribute("boardDto", boardDao.selectOne(boardNo));
		
//		2. 데이터를 읽도록 처리한다
		model.addAttribute("boardDto", boardDao.read(boardNo));
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
		
//		문제점 : 등록은 되는데 몇 번인지 알 수 없다
//		해결책 : 번호를 미리 생성하고 등록하도록 메소드 변경
		int boardNo = boardDao.insert2(boardDto);
		attr.addAttribute("boardNo", boardNo);
		return "redirect:detail";
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
