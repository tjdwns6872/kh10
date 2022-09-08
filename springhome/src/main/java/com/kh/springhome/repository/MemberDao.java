package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.MemberDto;

public interface MemberDao {

	void insert(MemberDto dto);
	
	List<MemberDto> selectList();
	List<MemberDto> selectList(String type, String keyword);
	
	MemberDto selectOne(String id);
	
	boolean update(MemberDto dto);
}
