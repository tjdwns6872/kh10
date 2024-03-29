package com.kh.spring16;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.entity.MusicDto;

@SpringBootTest
public class MusicSearchTest {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
//		(주의) mybatis에는 하나의 데이터만 전달이 가능하다.
		Map<String, String> param = new HashMap<>();
		param.put("type", "music_artist");
		param.put("keyword", "아이");
		
		List<MusicDto> list = sqlSession.selectList("music.search", param);

		for(MusicDto musicDto : list) {
			System.out.println(musicDto);
		}
	}
}








