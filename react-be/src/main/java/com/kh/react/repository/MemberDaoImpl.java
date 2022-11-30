package com.kh.react.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.react.entity.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public MemberDto login(MemberDto memberDto) {
		MemberDto findDto = sqlSession.selectOne("member.get", 
																memberDto.getMemberId());
		if(findDto == null) return null;
		
		boolean judge = memberDto.getMemberPw()
												.equals(findDto.getMemberPw());
		if(judge) {
			return findDto;
		}
		return null;
	}
	
}