package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.PocketMonsterDto;
import com.kh.springhome.vo.PocketMonsterCountVo;

public interface PocketMonsterDao {
	
	void insert(PocketMonsterDto pocketMonsterDto);
	List<PocketMonsterDto> selectList();
	PocketMonsterDto selectOnt(int no);
	boolean update(PocketMonsterDto dto);
	boolean delete(int no);

	List<PocketMonsterCountVo> selectCountList();
}
