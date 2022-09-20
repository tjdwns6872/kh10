package com.kh.springtest.repository;

import java.util.List;

import com.kh.springtest.entity.ToyDto;

public interface ToyDao {
	List<ToyDto> selectList();
}
