package com.kh.spring22.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring22.entity.MusicDto;

@Repository
public class MusicDaoImpl implements MusicDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<MusicDto> list() {
		return sqlSession.selectList("music.list");
	}
	@Override
	public MusicDto find(int musicNo) {
		return sqlSession.selectOne("music.find", musicNo);
	}
	@Override
	public void insert(MusicDto musicDto) {
		sqlSession.insert("music.insert", musicDto);
	}
	@Override
	public boolean edit(MusicDto musicDto) {
		int count = sqlSession.update("music.edit", musicDto);
		return count > 0;
	}
	@Override
	public boolean delete(int musicNo) {
		int count = sqlSession.update("music.delete", musicNo);
		return count > 0;
	}
}





