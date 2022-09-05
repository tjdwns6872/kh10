package com.kh.springhome.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.entity.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
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

}
