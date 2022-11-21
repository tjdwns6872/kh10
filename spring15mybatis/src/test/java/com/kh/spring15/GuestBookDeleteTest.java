package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GuestBookDeleteTest {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int no = 14;
		int count = sqlSession.delete("guestbook.delete", no);
		System.out.println("count = "+count);
	}
}
