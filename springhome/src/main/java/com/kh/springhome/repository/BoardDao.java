package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.BoardDto;
import com.kh.springhome.vo.BoardListSearchVO;

public interface BoardDao {
	void insert(BoardDto boardDto);
	int insert2(BoardDto boardDto);
	
	List<BoardDto> selectList();
	List<BoardDto> selectList(BoardListSearchVO vo);
	BoardDto selectOne(int boardNo);
	BoardDto read(int boardNo);//조회수 증가까지
	
	boolean updateReadcount(int boardNo);
	boolean update(BoardDto boardDto);
	
	void clear();
	boolean delete(int boardNo);
}
