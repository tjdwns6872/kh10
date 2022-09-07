package com.kh.springhome.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.kh.springhome.entity.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	private RowMapper<MemberDto> mapper = (rs, idx) ->{
		MemberDto dto = new MemberDto();
		dto.setMemberId(rs.getString("member_id"));
		dto.setMemberPw(rs.getString("member_pw"));
		dto.setMemberNick(rs.getString("member_nick"));
		dto.setMemberBirth(rs.getDate("member_birth"));
		dto.setMemberTel(rs.getString("member_tel"));
		dto.setMemberEmail(rs.getString("member_email"));
		dto.setMemberPost(rs.getString("member_post"));
		dto.setMemberBaseAddress(rs.getString("member_base_address"));
		dto.setMemberDetailAddress(rs.getString("member_detail_address"));
		dto.setMemberPoint(rs.getInt("member_point"));
		dto.setMemberGrade(rs.getString("member_grade"));
		dto.setMemberJoin(rs.getDate("member_join"));
		dto.setMemberLogin(rs.getDate("member_login"));
		return dto;
	};
	@Override
	public void insert(MemberDto memberDto) {
		String sql = "INSERT INTO  "
				+ "MEMBER(MEMBER_ID, MEMBER_PW, MEMBER_NICK, MEMBER_BIRTH, "
				+ "MEMBER_TEL, MEMBER_EMAIL, MEMBER_POST, "
				+ "MEMBER_BASE_ADDRESS, MEMBER_DETAIL_ADDRESS, "
				+ "MEMBER_JOIN, MEMBER_LOGIN) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, SYSDATE, NULL)";
		Object[] param = {memberDto.getMemberId(), memberDto.getMemberPw(), 
									memberDto.getMemberNick(), memberDto.getMemberBirth(), 
									memberDto.getMemberTel(), memberDto.getMemberEmail(), 
									memberDto.getMemberPost(), memberDto.getMemberBaseAddress(), 
									memberDto.getMemberDetailAddress()};
		jdbctemplate.update(sql, param);
	}

	@Override
	public List<MemberDto> selectList() {
		String sql = "select member_id, member_nick, member_grade, member_point, member_login "
				+ "from member order by member_id asc";
		return jdbctemplate.query(sql, mapper);
	}

	@Override
	public List<MemberDto> selectList(String type, String keyword) {
		String sql = "select member_id, member_nick, member_grade, member_point, member_login "
				+ "from member "
				+ "where instr(#1, ?) >0 "
				+ "order by #1 asc";
		sql = sql.replace("#1", type);
		Object[] param = {keyword};
		return jdbctemplate.query(sql, mapper, param);
	}

}
