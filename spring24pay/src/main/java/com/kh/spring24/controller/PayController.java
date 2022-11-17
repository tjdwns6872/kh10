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
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring24.entity.MemberDto;
import com.kh.spring24.service.KakaoPayService;
import com.kh.spring24.vo.KakaoPayApproveRequestVO;
import com.kh.spring24.vo.KakaoPayApproveResponseVO;
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
		
//		4번 시점에서 9번 시점에 필요한 데이터를 세션에 저장
		session.setAttribute("tid", response.getTid());
		session.setAttribute("partner_order_id", vo.getPartner_order_id());
		session.setAttribute("partner_user_id", vo.getPartner_user_id());
		
		return "redirect:"+response.getNext_redirect_pc_url();
	}
	
//	결제 성공 시 자동 호출될 주소
	@GetMapping("/pay/result/success")
	public String paySuccess(@RequestParam String pg_token, HttpSession session) throws URISyntaxException {
		
//		9번 시점에서 4번 시점에서 세션에 저장한 데이터를 추출 및 삭제
		String tid = (String)session.getAttribute("tid");
		String partner_order_id = (String)session.getAttribute("partner_order_id");
		String partner_user_id = (String)session.getAttribute("partner_user_id");
		session.removeAttribute("tid");
		session.removeAttribute("partner_order_id");
		session.removeAttribute("partner_user_id");
		
		KakaoPayApproveRequestVO vo = KakaoPayApproveRequestVO
				.builder()
				.tid(tid)
				.partner_order_id(partner_order_id)
				.partner_user_id(partner_user_id)
				.pg_token(pg_token)
				.build();
		KakaoPayApproveResponseVO response = kakaoPayService.approve(vo);
		return "redirect:/pay/result/success_view";
	}
	
	@GetMapping("/pay/result/success_view")
	public String successView() {
		return "success_view";
	}
}











