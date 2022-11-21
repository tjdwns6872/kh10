package com.kh.spring22.repository;

import java.util.List;

import com.kh.spring22.entity.MusicDto;

public interface MusicDao {

	List<MusicDto> list();

	MusicDto find(int musicNo);

	void insert(MusicDto musicDto);

	boolean edit(MusicDto musicDto);

	boolean delete(int musicNo);

}
