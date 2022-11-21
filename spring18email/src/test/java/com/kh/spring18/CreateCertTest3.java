package com.kh.spring18;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring18.service.EmailService;

@SpringBootTest
public class CreateCertTest3 {

	@Autowired
	private EmailService emailService;
	
	String email = "wsj_6872@naver.com";
	
	@Test
	public void test() {
		emailService.sendCertMail(email);
	}
	
}









