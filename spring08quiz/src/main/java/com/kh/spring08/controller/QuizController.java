package com.kh.spring08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.spring08.dto.MusicDto;

@Controller
@RequestMapping("/music")
public class QuizController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(@ModelAttribute 
			String title, String artist, String album) {
		String sql = "insert into music("
				+ "music_no, music_title, music_artist, "
				+ "music_album, release_time) "
				+ "values (music_seq.nextval, ?, ?, ?, sysdate)";
		Object[] param = {title, artist, album};
		
		jdbcTemplate.update(sql, param);
		
		return "등록 완료";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public String list() {
		String sql = "select * from music";
		List<MusicDto> data =
				jdbcTemplate.query(sql, MusicDto.getMapper());
		return data.toString();
	}
	
	@RequestMapping("/search")
	@ResponseBody
	public String search(String type, String keyword) {
		String sql = "select * from music where instr("+type+", ?) > 0";
		Object[] param = {keyword};
		List<MusicDto> data = 
				jdbcTemplate.query(sql, MusicDto.getMapper(), param);
		return data.toString();
	}
	
	@RequestMapping("/detail")
	@ResponseBody
	public String detail(int no) {
		String sql = "select * from music where no = ?";
		Object[] param = {no};
		MusicDto data = jdbcTemplate.query(
				sql, MusicDto.getExtractor(), param);
		
		if(data == null) {
			return "없는 번호입니다.";
		}else {
			return data.toString();
		}
	}
	
	
}
