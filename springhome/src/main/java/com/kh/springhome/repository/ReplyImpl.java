package com.kh.springhome.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.springhome.entity.ReplyDto;

@Repository
public class ReplyImpl implements ReplyDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper< ReplyDto> mapper = new RowMapper<ReplyDto>() {
		@Override
		public ReplyDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			return ReplyDto.builder()
					.replyNo(rs.getInt("reply_no"))
					.replyWriter(rs.getString("reply_writer"))
					.replyContent(rs.getString("reply_content"))
					.replyOrigin(rs.getInt("reply_origin"))
					.replyWritetime(rs.getDate("reply_writetime"))
					.build();	
		}
	};
	
	@Override
	public void insert(ReplyDto replyDto) {
		String sql = "insert into reply( "
				+ "reply_no, reply_writer, "
				+ "reply_content, reply_writetime, "
				+ "reply_origin) values ( "
				+ "reply_seq.nextval, ?, ?, sysdate, ?)";
		Object[] param = {replyDto.getReplyWriter(), replyDto.getReplyContent(), replyDto.getReplyOrigin()};
		jdbcTemplate.update(sql, param);
		
	}

	@Override
	public List<ReplyDto> selectList(int replyOrigin) {
		String sql = "select * from reply where reply_origin = ? order by reply_no asc";
		Object[] param = {replyOrigin};
		return jdbcTemplate.query(sql, mapper, param);
	}

	@Override
	public boolean update(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int replyNo) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
