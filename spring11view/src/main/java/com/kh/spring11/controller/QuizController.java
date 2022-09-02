package com.kh.spring11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.spring11.entity.GuestBookDto;

@Controller
@RequestMapping("/guest_book")
public class QuizController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/insert")
	@ResponseBody
	// 참고 @ModelAttribute는 객체의 필드에 자동 매핑을 수행한다.
	//public String insert(@ModelAttribute GuestBookDto dto
	public String insert(
			@RequestParam String name, 
			@RequestParam String memo) {
		String sql = "insert into guest_book(name, memo) "
				+ "values(guest_book_seq.nextval, ?, ?)";
		Object[] param = {name, memo};
		jdbcTemplate.update(sql, param);
		return "등록 완료!";
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(
			@RequestParam int no,
			@RequestParam String name,
			@RequestParam String memo) {
		String sql = "update guest_book set "
				+ "name = ? memo = ? "
				+ "where no = ?";
		Object[] param = {name, memo, no};
		int result = jdbcTemplate.update(sql, param);
		if(result > 0) {
			return "수정 완료";
		}else {
			return "없는 번호";
		}
	}
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(@RequestParam int no) {
		String sql = "delete guest_book where no = ?";
		Object[] param = {no};
		int result = jdbcTemplate.update(sql, param);
		if(result > 0) {
			return "삭제 완료";
		}else {
			return "없는 번호";
		}
	}
	@RequestMapping("/list")
	@ResponseBody
	public String list() {
		String sql = "select * from guest_book order by no asc";
		List<GuestBookDto> list = 
				jdbcTemplate.query(sql, GuestBookDto.getMapper());
		return list.toString();
	}
	
	@RequestMapping("detail")
	@ResponseBody
	public String detail(@RequestParam int no) {
		String sql = "select * from guest_book where no = ?";
		Object[] param = {no};
		GuestBookDto dto = jdbcTemplate.query(
				sql, GuestBookDto.getExtractor(), param);
		if(dto == null) {
			return "없는 번호";
		}else {
			return dto.toString();
		}
	}
	
	@RequestMapping("/search")
	@ResponseBody
	public String search(@RequestParam String str) {
		String sql = "select * from guest_book where instr(name, ?) > 0";
		Object[] param = {str};
		
		List<GuestBookDto> list = 
				jdbcTemplate.query(sql, GuestBookDto.getMapper(), param);
		return list.toString();
	}
}








