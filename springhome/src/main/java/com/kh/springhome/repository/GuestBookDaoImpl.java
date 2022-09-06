package com.kh.springhome.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.springhome.entity.GuestBookDto;

//DAO(Data Access Object)의 본문(구현체)
@Repository
public class GuestBookDaoImpl implements GuestBookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insert(GuestBookDto dto) {
		String sql = "insert into guest_book(no, name, memo) "
								+ "values(guest_book_seq.nextval, ?, ?)";
		Object[] param = {dto.getName(), dto.getMemo()};
		jdbcTemplate.update(sql, param);
	}

	@Override
	public boolean update(GuestBookDto dto) {
		String sql = "update guest_book set name=?, memo=? where no=?";
		Object[]  param = {dto.getName(), dto.getMemo(), dto.getNo()};
		int result = jdbcTemplate.update(sql, param);
		return result > 0;	//retrun (result가 0보다 큰지 비교한 결과를 반환)
									// 크다 → true 반환 // 아니다 → false 반환
	}

	@Override
	public boolean delete(int no) {
		String sql = "delete guest_book where no = ?";
		Object[] param = {no};
		int result = jdbcTemplate.update(sql, param);
		return result > 0;	
	}

	//★ RowMapper와 ResultSetExtractor는 DAO에 만든다
	//RowMapper - 목록
		private static RowMapper<GuestBookDto> mapper = (rs, idx) -> {
			GuestBookDto dto = new GuestBookDto();
			dto.setNo(rs.getInt("NO"));
			dto.setName(rs.getString("NAME"));
			dto.setMemo(rs.getString("MEMO"));
			return dto;
		};
		//같은 class에 있으니까 getMapper() 필요없음
//		public static RowMapper<GuestBookDto> getMapper() {
//			return mapper;
//		}
	@Override	//목록 기능
	public List<GuestBookDto> selectList() {
		String sql = "select * from guest_book order by no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	@Override	//검색 기능
	public List<GuestBookDto> selectList(String type, String keyword) {
		String sql = "select * from guest_book "
							+ "where instr(#1, ?) >0 "
							+ "order by #1 asc";
		sql = sql.replace("#1", type);
		Object[] param = {keyword};
		return jdbcTemplate.query(sql, mapper, param);
	}
	
	//★ RowMapper와 ResultSetExtractor는 DAO에 만든다
	//ResultSetExtractor - 객체
	private static ResultSetExtractor<GuestBookDto> extractor = (rs) -> {
		if(rs.next()) {
			GuestBookDto dto = new GuestBookDto();
			dto.setNo(rs.getInt("NO"));
			dto.setName(rs.getString("NAME"));
			dto.setMemo(rs.getString("MEMO"));
			return dto;
		} else {
			return null;
		}
	};
	//같은 class에 있으니까 getExtractor() 필요없음
//	public static ResultSetExtractor<GuestBookDto> getExtractor() {
//		return extractor;
//	}
	@Override	//상세 기능
	public GuestBookDto selectOne(int no) {
		String sql = "select * from guest_book where no = ?";
		Object[] param = {no};
		return jdbcTemplate.query(sql, extractor, param);
	}

	@Override
	public List<GuestBookDto> tableList() {
		String sql = "select * from Guest_book order by no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
}
