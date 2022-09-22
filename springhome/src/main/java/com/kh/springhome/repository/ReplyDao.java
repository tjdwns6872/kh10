package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.ReplyDto;

public interface ReplyDao {
	void insert(ReplyDto replyDto);
	List<ReplyDto> selectList(int replyOrigin);
	ReplyDto selectOne(int replyNo);
	boolean update(ReplyDto replyDto);
	boolean delete(int replyNo);
}
