package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.entity.MusicDto;

@SpringBootTest
public class MusicInsertTest {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		MusicDto dto = MusicDto.builder()
					.musicTitle("곰인형")
					.musicArtist("린")
					.musicAlbum("곰인형")
				.build();
		sqlSession.insert("music.add", dto);
	}
}
