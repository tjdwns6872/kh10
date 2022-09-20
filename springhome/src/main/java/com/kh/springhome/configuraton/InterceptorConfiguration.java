package com.kh.springhome.configuraton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kh.springhome.interceptor.AdminInterceptor;
import com.kh.springhome.interceptor.MemberBoardOwnerCheckInterceptor;
import com.kh.springhome.interceptor.MemberBoardPermissionCheckInterceptor;
import com.kh.springhome.interceptor.MemberInterceptor;

// 스프링 설정파일
// - application.properties에서 설정하기 어려운 복잡한 설정을 구현
// - 프로그램 동작 방식과 관련된 설정일 경우 특정 인터페이스를 상속받아야함
// - interface WebMvcConfigurer
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer{
	
	@Autowired
	private MemberInterceptor memberInterceptor;
	@Autowired
	private AdminInterceptor adminInterceptor;
//	@Autowired
//	private TestInterceptor testInterceptor;
	@Autowired
	private MemberBoardPermissionCheckInterceptor permissionCheckInterceptor;
	@Autowired
	private MemberBoardOwnerCheckInterceptor ownerCheckInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry에 추가하여 인터셉터가 작동하도록 설정
//		registry.addInterceptor(testInterceptor).
//			addPathPatterns("/**");
		
		//회원
		registry.addInterceptor(memberInterceptor).
			addPathPatterns(//인터셉터가 감시할 주소
				"/pocketmon/**", //포켓몬 전체
				"/music/detail", //음원 상세
				"/member/**", //회원전체
				"/board/**"). //게시판 전체
			excludePathPatterns(//제외할 주소
				"/member/insert*", //회원가입
				"/member/login*", //로그인
				"/member/goodbye_result", 
				"/board/list",
				"/board/detail"); //탈퇴완료
		
		//관리자
		registry.addInterceptor(adminInterceptor).
			addPathPatterns(
				"/guestbook/edit*", //방명록 수정페이지
				"/guestbook/delete", //방명록 삭제페이지
				"/music/**", //음원 전체
				"/member/list", //회원목록
				"/member/detail", //회원상세
				"/member/edit*", //회원수정
				"/member/delete"). //회원삭제
			excludePathPatterns(
				"/music/list", //음원 목록
				"/music/detail"); //음원 상세
		
		//관리자만 공지사항을 등록할 수 있도록 검사하는 인터셉터
		registry.addInterceptor(permissionCheckInterceptor).addPathPatterns(
				"/board/edit",
				"/board/write"
				);
		
		//소유자 또는 관리자만 수정/삭제를 할 수 있도록 검사하는 인터셉터
		registry.addInterceptor(ownerCheckInterceptor).addPathPatterns(
				"/board/edit",
				"/board/delete");
	}
}