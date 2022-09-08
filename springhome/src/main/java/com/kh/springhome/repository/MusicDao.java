package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.MusicDto;

public interface MusicDao {
	void insert(MusicDto musicDto);
	List<MusicDto> selectList();
	List<MusicDto> selectList(String type, String keyword);
	MusicDto selectOne(int musicNo);
	boolean update(MusicDto musicDto);
}
