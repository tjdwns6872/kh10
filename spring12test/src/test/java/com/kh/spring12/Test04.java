package com.kh.spring12;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test04 {
	
	@BeforeEach //테스트 실행 전 단계에서 실행할 준비 메소드
	public void before() {
		System.out.println("데이터 추가");
	}
	
	@Test
	public void test() {
		System.out.println("테스트");
	}
	
	@AfterEach
	public void after() {//테스트 실행 후에 실행할 정리 메소드
		System.out.println("데이터 삭제");
	}
}
