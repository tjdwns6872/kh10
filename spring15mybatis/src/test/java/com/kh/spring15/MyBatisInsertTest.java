package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.entity.GuestBookDto;

@SpringBootTest
public class MyBatisInsertTest {
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		GuestBookDto dto = GuestBookDto.builder()
				.no(14)
				.name("mybatis 테스트")
				.memo("mybatis 테스트")
			.build();
		sqlSession.insert("guestbook.add", dto);
	}
}











