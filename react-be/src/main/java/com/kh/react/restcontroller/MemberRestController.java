package com.kh.react.restcontroller;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.react.entity.MemberDto;
import com.kh.react.entity.vo.MemberLoginVO;
import com.kh.react.repository.MemberDao;

@CrossOrigin
@RestController
@RequestMapping("/member")
public class MemberRestController {
	
	@Autowired
	private MemberDao memberDao;
	
	/*
	 * 사용자가 전송한 JSON을 토대로 로그인을 판정
	 * - 로그인 성공 : 회원정보(memberDto) + 토큰(token)
	 * - 로그인 실패 : 클라이언트에게 404 error 전송
	 */
	@PostMapping("/login")
	public ResponseEntity<MemberLoginVO> login(
			@RequestBody MemberDto memberDto,
			HttpSession session) {
		MemberDto findDto = memberDao.login(memberDto);
		if(findDto == null) {
			return ResponseEntity.notFound().build();//404
		}
		
		String token = UUID.randomUUID().toString();
		session.setAttribute("token", token);
		
		return ResponseEntity.ok(MemberLoginVO.builder()
															.member(findDto)//DB의 회원정보
															.token(token)//인증용 토큰
															.build());
	}
	
}