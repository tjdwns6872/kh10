package com.kh.spring09.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.spring09.entity.GuestBookDto;

//DAO(Data Access Object)의 본문(구현체)
@Repository
public class GuestBookDaoImpl implements GuestBookDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(GuestBookDto dto) {
		String sql = "insert into guest_book(no, name, memo) "
				+ "valuese(guest_book_seq.nextval, ?, ?)";
		
		Object[] param = {dto.getName(), dto.getMemo()};
		jdbcTemplate.update(sql, param);
	}

	@Override
	public boolean update(GuestBookDto dto) {
		String sql = "update guest_book set name=?, memo=? where no=?";
		Object[] param = {dto.getName(), dto.getMemo(), dto.getNo()};
		int result = jdbcTemplate.update(sql, param);
		return result > 0;
	}

	@Override
	public boolean delete(int no) {
		String sql = "delete guest_book where no = ?";
		Object[] param = {no};
		int result = jdbcTemplate.update(sql, param);
		return result > 0;
	}
	private RowMapper<GuestBookDto> mapper = (rs, idx) ->{
		GuestBookDto dto = new GuestBookDto();
		dto.setNo(rs.getInt("no"));
		dto.setName(rs.getString("name"));
		dto.setMemo(rs.getString("memo"));
		return dto;
	};

	@Override
	public List<GuestBookDto> selectList() {
		String sql = "select * from guest_book order by no asc";
//		List<GuestBookDto> data = jdbcTemplate.query(sql, mapper);
		return jdbcTemplate.query(sql, mapper);
	}

	@Override
	public List<GuestBookDto> selectList(String type, String keyword) {
		String sql = "select * from guest_book "
				+ "where instr(#1, ?) > 0 "
				+ "order by #1 asc";
		sql = sql.replace("#1", type);
		Object[] param = {keyword};
		return jdbcTemplate.query(sql, mapper, param);
	}

	private ResultSetExtractor<GuestBookDto> extractor = (rs) ->{
		if(rs.next()) {
			GuestBookDto dto = new GuestBookDto();
			dto.setNo(rs.getInt("no"));
			dto.setName(rs.getString("name"));
			dto.setMemo(rs.getString("memo"));
			return dto;
		}else {
			return null;
		}
	};
	@Override
	public GuestBookDto selectOne(int no) {
		String sql = "select * from guest_book where no = ?";
		Object[] param = {no};
		return jdbcTemplate.query(sql, extractor, param);
	}

}
