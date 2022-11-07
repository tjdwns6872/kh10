package com.kh.spring14;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.entity.PocketMonsterDto;

@SpringBootTest
public class MybatisInsertTest {
	
	@Autowired
	private SqlSession sqlSession; // 마이바티스 실행 도구
	
	@Test
	public void test() {
//		assertNotNull(sqlSession);
		
		// 미리 준비해둔 pocketmonster의 add 구문을 가져와서 실행
//		sqlSession.insert("pocketmon.add");
		PocketMonsterDto dto = PocketMonsterDto.builder()
											.no(999)
											.name("테스트")
											.type("테스트")
										.build();
		sqlSession.insert("pocketmon.add", dto);
	}
}
