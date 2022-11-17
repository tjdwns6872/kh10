package com.kh.spring24.controller;

import java.net.URISyntaxException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring24.entity.MemberDto;
import com.kh.spring24.service.KakaoPayService;
import com.kh.spring24.vo.KakaoPayReadyRequestVO;
import com.kh.spring24.vo.KakaoPayReadyResponseVO;

@Controller
public class PayController {
	
	@Autowired
	private SqlSession sqlSession;

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute MemberDto memberDto,
			HttpSession session) {
		MemberDto findDto = sqlSession.selectOne(
					"member.get", memberDto.getMemberId());
		if(findDto == null) return "redirect:/";
		
		boolean judge = memberDto.getMemberPw()
											.equals(findDto.getMemberPw());
		if(judge) {
			session.setAttribute("loginId", findDto.getMemberId());
			session.setAttribute("loginNick", findDto.getMemberNick());
			session.setAttribute("loginAuth", findDto.getMemberGrade());
		}
		return "redirect:/";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
//	결제 페이지 1번 - 입력창에 입력하면 결재되도록 구현
	@GetMapping("/pay1")
	public String pay1() {
		return "pay1";
	}
	
	@Autowired
	private KakaoPayService kakaoPayService;
	
	@PostMapping("/pay1")
	public String pay1(@ModelAttribute KakaoPayReadyRequestVO vo,
			HttpSession session) throws URISyntaxException {
		String memberId = (String)session.getAttribute("loginId");
		vo.setPartner_user_id(memberId);
		vo.setPartner_order_id(UUID.randomUUID().toString());
		
		KakaoPayReadyResponseVO response = kakaoPayService.ready(vo);
		
		return "redirect:"+response.getNext_redirect_pc_url();
	}
}











