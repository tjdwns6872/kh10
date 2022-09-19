package com.kh.springhome.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.springhome.entity.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<BoardDto> mapper = new RowMapper<BoardDto>() {
		
		@Override
		public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardDto boardDto = new BoardDto();
			boardDto.setBoardNo(rs.getInt("board_no"));
			boardDto.setBoardWriter(rs.getString("board_writer"));
			boardDto.setBoardTitle(rs.getString("board_title"));
			boardDto.setBoardContent(rs.getString("board_content"));
			boardDto.setBoardWriteTime(rs.getDate("board_writetime"));
			boardDto.setBoardUpdateTime(rs.getDate("board_updatetime"));
			boardDto.setBoardRead(rs.getInt("board_read"));
			boardDto.setBoardLike(rs.getInt("board_like"));
			boardDto.setBoardHead(rs.getString("board_head"));
			return boardDto;
		}
	};
	private ResultSetExtractor<BoardDto> extractor = new ResultSetExtractor<BoardDto>() {
		
		@Override
		public BoardDto extractData(ResultSet rs) throws SQLException, DataAccessException {
			BoardDto boardDto = new BoardDto();
			if(rs.next()) {
				boardDto.setBoardNo(rs.getInt("board_no"));
				boardDto.setBoardWriter(rs.getString("board_writer"));
				boardDto.setBoardTitle(rs.getString("board_title"));
				boardDto.setBoardContent(rs.getString("board_content"));
				boardDto.setBoardWriteTime(rs.getDate("board_writetime"));
				boardDto.setBoardUpdateTime(rs.getDate("board_updatetime"));
				boardDto.setBoardRead(rs.getInt("board_read"));
				boardDto.setBoardLike(rs.getInt("board_like"));
				boardDto.setBoardHead(rs.getString("board_head"));
				return boardDto;
			}else {				
				return null;
			}
		}
	};

	@Override
	public List<BoardDto> selectList() {
		String sql = "select * from board";
		return jdbcTemplate.query(sql, mapper);
	}

	@Override
	public void write(BoardDto boardDto) {
		String sql = "insert into board(board_no, board_writer, board_head, "
				+ "board_title, board_content) "
				+ "values(board_seq.nextval, ?, ?, ?, ?)";
		Object[] param = {boardDto.getBoardWriter(), boardDto.getBoardHead(),
				boardDto.getBoardTitle(), boardDto.getBoardContent()
				};
		jdbcTemplate.update(sql, param);
	}
	@Override
	public BoardDto selectOne(int boardNo) {
		String sql = "select * from board where board_no = ?";
		Object[] param = {boardNo};
		return jdbcTemplate.query(sql, extractor, param);
	}

	@Override
	public boolean delete(int boardNo) {
		String sql = "delete board where board_no=?";
		Object[] param = {boardNo};
		return jdbcTemplate.update(sql, param)>0;
	}

	@Override
	public List<BoardDto> selectList(String type, String keyword) {
		String sql = "select * from board "
				+ "where instr(#1, ?) > 0 "
				+ "order by #1 asc";
		sql = sql.replace("#1", type);
		Object[] param = {keyword};
		return jdbcTemplate.query(sql, mapper, param);
	}

	@Override
	public boolean update(BoardDto boardDto) {
		String sql = "update board set "
				+ "board_title=?, "
				+ "board_content=?, "
				+ "board_updatetime=sysdate, "
				+ "board_head=? "
				+ "where board_no=?";
		Object[] param= {boardDto.getBoardTitle(), boardDto.getBoardContent(),
				boardDto.getBoardHead(), boardDto.getBoardNo()};
		return jdbcTemplate.update(sql, param)>0;
	}
}
