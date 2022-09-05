package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.GuestBookDto;

//DAO(Data Access Object)의 목차(추상체)
public interface GuestBookDao {

	void insert(GuestBookDto dto);			//등록 기능
	
	boolean update(GuestBookDto dto);	//수정 기능
	
	boolean delete(int no);						//삭제 기능
	
	List<GuestBookDto> selectList();			//목록 기능
	List<GuestBookDto> selectList(String type, String keyword);	//검색 기능
	
	GuestBookDto selectOne(int no);		//상세 기능
	
}
