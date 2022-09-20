package com.kh.springtest.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.springtest.entity.ToyDto;

@Repository
public class ToyDaoImpl implements ToyDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private RowMapper<ToyDto> mapper = (rs, rowNum) -> {
		return ToyDto.builder()
				.toyNo(rs.getInt("toy_no"))
				.toyName(rs.getString("toy_name"))
				.toyPrice(rs.getInt("toy_price"))
				.build();
	};
	
	@Override
	public List<ToyDto> selectList() {
		String sql = "select * from toy order by toy_no asc";
		return jdbcTemplate.query(sql, mapper);
	}

}
