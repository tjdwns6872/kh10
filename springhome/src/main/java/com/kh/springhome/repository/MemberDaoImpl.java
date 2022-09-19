package com.kh.springhome.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.springhome.entity.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	방법 1
//	insert into member(
//			아이디, 비밀번호, 닉네임, 생년월일, 전화번호, 
//			이메일, 우편번호, 기본주소, 상세주소)
//	values(?, ?, ?, ?, ?, ?, ?, ?, ?);
	
//	방법 2
//	insert into member(
//			아이디, 비밀번호, 닉네임, 생년월일, 전화번호, 
//			이메일, 우편번호, 기본주소, 상세주소, 포인트, 
//			등급, 가입일, 로그인일시)
//	values(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, '일반', sysdate, null);
	
	
	@Override
	public void insert(MemberDto memberDto) {
		String sql = "insert into member("
								+ "member_id, member_pw, member_nick, "
								+ "member_birth, member_tel, member_email, "
								+ "member_post, member_base_address, "
								+ "member_detail_address) "
						+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Object[] param = {
			memberDto.getMemberId(), memberDto.getMemberPw(),
			memberDto.getMemberNick(), memberDto.getMemberBirth(),
			memberDto.getMemberTel(), memberDto.getMemberEmail(),
			memberDto.getMemberPost(), memberDto.getMemberBaseAddress(),
			memberDto.getMemberDetailAddress()
		};
		jdbcTemplate.update(sql, param);
	}
	
	private RowMapper<MemberDto> mapper = new RowMapper<MemberDto>() {
		@Override
		public MemberDto mapRow(ResultSet rs, int rowNum) throws SQLException {
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
			dto.setMemberJoin(rs.getDate("member_join"));
			dto.setMemberLogin(rs.getDate("member_login"));
			dto.setMemberGrade(rs.getString("member_grade"));
			return dto;
		}
	};
	
	private ResultSetExtractor<MemberDto> extractor = rs -> {
		if(rs.next()) {
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
			dto.setMemberJoin(rs.getDate("member_join"));
			dto.setMemberLogin(rs.getDate("member_login"));
			dto.setMemberGrade(rs.getString("member_grade"));
			return dto;
		}else {
			return null;
		}
	};
	
	@Override
	public List<MemberDto> selectList() {
		String sql = "select * from member order by member_id";
		return jdbcTemplate.query(sql, mapper);
	}
	
	@Override
	public List<MemberDto> selectList(String type, String keyword) {
		String sql = "select * from member where instr(#1, ?) > 0 order by #1 asc";
		sql = sql.replace("#1", type);
		Object[] param = {keyword};
		return jdbcTemplate.query(sql, mapper, param);
	}

	@Override
	public MemberDto selectOne(String id) {
		String sql = "select * from member where member_id=?";
		Object[] param= {id};
		return jdbcTemplate.query(sql, extractor, param);
	}

	@Override
	public boolean update(MemberDto dto) {
		String sql = "update member set "
				+ "member_nick=?, member_tel=?, member_email=?, "
				+ "member_post=?, member_base_address=?, member_detail_address=?, "
				+ "member_grade=? where member_id=?";
		Object[] param = {dto.getMemberNick(), dto.getMemberTel(),
				dto.getMemberEmail(), dto.getMemberPost(), dto.getMemberBaseAddress(),
				dto.getMemberDetailAddress(), dto.getMemberGrade(), dto.getMemberId()};
		int result = jdbcTemplate.update(sql, param);
		return result > 0;
	}

	@Override
	public boolean delete(String id) {
		String sql = "delete member where member_id=?";
		Object[] param = {id};
		return jdbcTemplate.update(sql, param) > 0;
	}

	@Override
	public boolean changePassword(String memberId, String memberPw) {
		String sql ="update member set member_pw=? where member_id=?";
		Object[] param = {memberPw, memberId};
		return jdbcTemplate.update(sql, param) > 0;
	}

	@Override
	public boolean changeInformation(MemberDto memberDto) {
		String sql = "update member set "
				+ "member_Nick=?, member_Birth=?, member_Tel=?, "
				+ "member_Email=?, member_Post, member_Base_Address=?, "
				+ "member_Detail_Address=? where member_Id=?";
		Object[] param = {memberDto.getMemberNick(), memberDto.getMemberBirth(), memberDto.getMemberTel(),
				memberDto.getMemberEmail(), memberDto.getMemberPost(), memberDto.getMemberBaseAddress(),
				memberDto.getMemberDetailAddress(), memberDto.getMemberId()};
		return jdbcTemplate.update(sql, param)>0;
	}

	@Override
	public boolean updateLoginTime(String memberId) {
		String sql = "update member set "
				+ "member_Login=sysdate "
				+ "where member_id=?";
		Object[] param= {memberId};
		return jdbcTemplate.update(sql, param) > 0;
	}

	
}
