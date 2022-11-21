package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MusicDetailTest {

	@Autowired
	SqlSession sqlSession;
	
	@Test
	public void test() {
		int no = 22;
		int count = sqlSession.selectOne("music.detail", no);
		System.out.println("count = "+count);
	}
}
