package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.entity.MusicDto;

@SpringBootTest
public class MusicUpdateTest {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int count = sqlSession.update("music.edit", MusicDto.builder()
												.musicNo(48)
												.musicTitle("변경된노래")
												.musicArtist("변경된가수")
												.musicAlbum("변경된앨범")
											.build());
		System.out.println("count = "+count);
	}
}
