package com.kh.spring18;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring18.entity.CertDto;
import com.kh.spring18.repository.CertDao;

@SpringBootTest
public class CheckCertTest2 {

	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private CertDao certDao;
	
	String email = "wsj_6872@naver.com";
	String serial = "277454";
	
	@Test
	public void test() {
		CertDto certDto = CertDto.builder()
					.who(email)
					.serial(serial)
				.build();
		boolean result = certDao.check(certDto);
		
		if(result) {
			System.out.println("인증 성공");
		}else {
			System.out.println("인증 실패");
		}
	}
}













