package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.BoardDto;

public interface BoardDao {
	List<BoardDto> selectList();
	List<BoardDto> selectList(String type, String keyword);
	BoardDto selectOne(int boardNo);
	
	boolean delete(int boardNo);
	boolean update(BoardDto boardDto);
	void write(BoardDto boardDto);
}
