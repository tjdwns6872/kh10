package com.kh.spring22.repository;

import java.util.List;

import com.kh.spring22.entity.PocketMonsterDto;

public interface PocketMonsterDao {

	 public List<PocketMonsterDto> list();

	public void insert(PocketMonsterDto dto);

	public boolean edit(PocketMonsterDto dto);

	public boolean delete(int no);

	public PocketMonsterDto find(int no);
}
