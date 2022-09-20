package com.kh.springhome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.springhome.entity.BoardDto;
import com.kh.springhome.repository.BoardDao;

import lombok.Data;
@SpringBootTest
public class BoardBummyTest {

	@Autowired
	private BoardDao boardDao;
	
	@Test
	public void before() {
		for(int i=1; i <= 7909; i++) {
			boardDao.insert(BoardDto.builder()
					.boardHead(null)
					.boardTitle("테스트"+i)
					.boardContent("테스트"+i)
					.boardWriter("admin1")
					.build());
		}
	}
	@BeforeEach
	public void after() {
		boardDao.clear();
	}
}
