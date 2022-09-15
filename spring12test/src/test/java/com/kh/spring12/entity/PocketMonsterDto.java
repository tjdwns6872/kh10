package com.kh.spring12.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class PocketMonsterDto {
	//field - 컬럼과 동일하게
	private int no;
	private String name;
	private String type;
	public PocketMonsterDto() {
		super();
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "PocketMonsterDto [no=" + no + ", name=" + name + ", type=" + type + "]";
	}
	
	//RowMapper - 목록
	private static RowMapper<PocketMonsterDto> mapper = new RowMapper<PocketMonsterDto>() {
		@Override
		public PocketMonsterDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			PocketMonsterDto dto = new PocketMonsterDto();
			dto.setNo(rs.getInt("no"));
			dto.setName(rs.getString("name"));
			dto.setType(rs.getString("type"));
			return dto;
		}
	};
	public static RowMapper<PocketMonsterDto> getMapper() {
		return mapper;
	}
	
	//ResultSetExtractor - 객체
	private static ResultSetExtractor<PocketMonsterDto> extractor = new ResultSetExtractor<PocketMonsterDto>() {
		@Override
		public PocketMonsterDto extractData(ResultSet rs) throws SQLException, DataAccessException {
			if(rs.next()) {
				PocketMonsterDto dto = new PocketMonsterDto();
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setType(rs.getString("type"));
				return dto;
			}
			else {
				return null;
			}
		}
	};
	public static ResultSetExtractor<PocketMonsterDto> getExtractor() {
		return extractor;
	}
	
}
