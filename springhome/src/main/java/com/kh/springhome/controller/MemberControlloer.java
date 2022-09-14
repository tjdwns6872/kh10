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

import com.kh.springhome.entity.MemberDto;
import com.kh.springhome.repository.MemberDao;

@Controller
@RequestMapping("/member")
public class MemberControlloer {

	@Autowired
	private MemberDao memberDao;
	
	@GetMapping("/insert")
	public String insert() {
		return "member/insert";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute MemberDto memberDto) {
		memberDao.insert(memberDto);
		return "redirect:insert_success";
	}
	
	@RequestMapping("/insert_success")
	public String insertSuccess() {
		return "member/insertSuccess";
	}
	
	@GetMapping("/list")
	public String list(Model model,
				@RequestParam(required = false) String type,
				@RequestParam(required = false) String keyword) {
		boolean isSearch = type != null && keyword != null;
		if(isSearch) {
			model.addAttribute("list", memberDao.selectList(type, keyword));
		}
		else {
			model.addAttribute("list", memberDao.selectList());
		}
		return "member/list";
	}
	
	@GetMapping("/detail")
	public String detail(Model model,
			@RequestParam String id) {
		MemberDto dto = memberDao.selectOne(id);
		model.addAttribute("dto", dto);
		return "member/detail";
	}
	@GetMapping("/edit")
	public String edit(Model model,
			@RequestParam String id) {
		model.addAttribute("dto", memberDao.selectOne(id));
		return "member/edit";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute MemberDto dto,
			RedirectAttributes attr) {
		boolean result = memberDao.update(dto);
		if(result) {
			attr.addAttribute("id", dto.getMemberId());
			return "redirect:detail";
		}else {
			return "redirect:edit_fail";
		}
	}
	@GetMapping("/edit_fail")
	public String editFail() {
		return "guestbook/editFail";
	}
	@GetMapping("/delete")
	public String delete(String id) {
		boolean result = memberDao.delete(id);
		if(result) {
			return "redirect:list";
		}else {
			return "guestbook/editFail";
		}
	}
	@GetMapping("/login")
	public String login() {
		return "member/login";
	}
	// 1.데이베이스에서 아이디에 해당하는 정보를 불러온다.
	// 2. 불러온 정보의 비밀번호와 사용자가 입력한 비밀번호를 비교한다.
	// <결과>
	// 1번이 실패할 경우 -> 로그인 실패
	// 1번은 성공했으나 2번이 실패할 경우 -> 로그인 실패
	// 1번과 2번이 모두 성공할 경우 -> 로그인 성공
	@PostMapping("/login")
	public String login(@ModelAttribute MemberDto inputDto,
			HttpSession session) {
		MemberDto findDto = memberDao.selectOne(inputDto.getMemberId());
		if(findDto == null) {
			return "redirect:login"; //redirect는 언제나 GET방식
		}
		//inputDto는 사용자가 입력한 정보, 
		//findDto는 데이터베이스 조회 결과
		boolean passwordMatch = 
				inputDto.getMemberPw().equals(findDto.getMemberPw());
		if(passwordMatch) {
			// - HttpSession에 사용자가 로그인 했음을 기록
			// - 필요 시 컨트롤러 매개변수에 해당 변수를 선언
			// - key=value 형태로 관리되는 저장소이며 다음의 명령이 존재
			// - session.setAttribute("이름", 값);
			// - session.getAttribute("이름");
			// - session.removeAttribute("이름");
			session.setAttribute("loginId", inputDto.getMemberId());
			session.setAttribute("mg", findDto.getMemberGrade());
//			System.out.println(">"+memberDao.selectOne((String)session.getAttribute("loginId")));
			System.out.println("loginId: "+session.getAttribute("loginId"));
			return "redirect:/";
		}else {
			return "redirect:login"; //redirect는 언제나 GET방식
		}
	}
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("loginId");
		session.removeAttribute("mg");
//		session.invalidate(); //세션 파괴(비추천, 사용자 측정 시 문제)
		return "redirect:/";
	}
	// 마이페이지 - 현재 로그인한 회원의 정보를 화면에 출력
	// Httpsession, Model
	@GetMapping("/mypage")
	public String mypage(HttpSession session, Model model) {
		// 1. 세션에 들어있는 아이디를 꺼낸다.
		// (참고) 세션에 데이터는 Object 형태로 저장되므로 꺼내려면 다운 캐스팅을 해야한다.
		String loginId = (String)session.getAttribute("loginId");
		// 2. 아이디를 이용하여 회원 정보를 불러온다.
		MemberDto dto = memberDao.selectOne(loginId);
		// 3. 불러온 회원 정보를 모델에 첨부한다.
		model.addAttribute("dto", dto);
		// 4. 화면(View)으로 전달(Forward)한다.
		// (참고) 기존에 사용하던 회원상세(detail.jsp) 뷰와 같이 사용
		return "member/detail";
	}
	@GetMapping("/password")
	public String password() {
		return "member/password";
	}
	@PostMapping("/password")
	public String passwor(HttpSession session, 
			@RequestParam String beforePw, 
			@RequestParam String pw) {
		String loginId = (String)session.getAttribute("loginId");
		try{
			MemberDto memberDto = memberDao.selectOne(loginId);
			boolean passwordMatch = beforePw.equals(memberDto.getMemberPw());
			if(!passwordMatch) {
				throw new Exception(); 
			}
			memberDao.changePassword(loginId, pw);
			return "redirect:password_result";
		}catch (Exception e) {
			return "redirect:password?error";			
		}
	}
	@GetMapping("/password_result")
	public String passwordResult() {
		return "member/passwordResult";
	}
}












