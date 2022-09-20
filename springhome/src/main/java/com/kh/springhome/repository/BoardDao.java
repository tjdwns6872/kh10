package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.BoardDto;
import com.kh.springhome.vo.BoardListSearchVO;

public interface BoardDao {
	void insert(BoardDto boardDto);
	int insert2(BoardDto boardDto);
	
	List<BoardDto> selectList();
	
	//통합검색 메소드(목록+검색)
	List<BoardDto> selectList(BoardListSearchVO vo);
	List<BoardDto> list(BoardListSearchVO vo);
	List<BoardDto> search(BoardListSearchVO vo);
	
	//검색과 목록의 총데이터 개수를 구하는 메소드(마지막 페이지 번호)
	int count(BoardListSearchVO vo);
	int searchCount(BoardListSearchVO vo);
	int listCount(BoardListSearchVO vo);
	
	BoardDto selectOne(int boardNo);
	BoardDto read(int boardNo);//조회수 증가까지
	
	boolean updateReadcount(int boardNo);
	boolean update(BoardDto boardDto);
	
	void clear();
	boolean delete(int boardNo);
}
