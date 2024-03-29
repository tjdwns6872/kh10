package com.kh.spring18;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring18.entity.CertDto;

@SpringBootTest
public class CheckCertTest {

	@Autowired
	private SqlSession sqlSession;
	
	String email = "wsj_6872@naver.com";
	String serial = "277454";
	
	@Test
	public void test() {
		CertDto result = sqlSession.selectOne("cert.check", CertDto.builder()
					.who(email)
					.serial(serial)
				.build());
		System.out.println(result);
		
		if(result != null) {
			System.out.println("인증 성공");
			sqlSession.delete("cert.delete",email);
		}else {
			System.out.println("인증 실패");
		}
	}
}













