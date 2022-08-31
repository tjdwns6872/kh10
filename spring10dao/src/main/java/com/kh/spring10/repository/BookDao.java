package com.kh.spring10.repository;

import java.awt.print.Book;
import java.util.List;

import com.kh.spring10.entity.BookDto;

public interface BookDao {
	void insert(BookDto dto);
	boolean update(BookDto dto);
	boolean delete(int bookSerial);
	List<BookDto> selectList();
	List<BookDto> selectList(String type, String keyword);
	BookDto selectOne(int bookSerial);
}
