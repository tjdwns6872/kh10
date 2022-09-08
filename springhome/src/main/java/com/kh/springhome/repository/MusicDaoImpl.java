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

import com.kh.springhome.entity.MusicDto;

@Repository
public class MusicDaoImpl implements MusicDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<MusicDto> mapper = new RowMapper<MusicDto>() {
		@Override
		public MusicDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			MusicDto dto = new MusicDto();
			dto.setMusicNo(rs.getInt("music_no"));
			dto.setMusicTitle(rs.getString("music_title"));
			dto.setMusicArtist(rs.getString("music_artist"));
			dto.setMusicAlbum(rs.getString("music_album"));
			dto.setMusicPlay(rs.getInt("music_play"));
			dto.setReleaseTime(rs.getDate("release_time"));
			return dto;
		}
	};
	
	@Override
	public void insert(MusicDto musicDto) {
		String sql = "insert into music("
							+ "music_no, music_title, music_artist, "
							+ "music_album, music_play, release_time"
						+ ") values("
							+ "music_seq.nextval, ?, ?, ?, 0, ?"
						+ ")";
		Object[] param = {
			musicDto.getMusicTitle(), musicDto.getMusicArtist(),
			musicDto.getMusicAlbum(), musicDto.getReleaseTime()
		};
		jdbcTemplate.update(sql, param);
	}
	
	@Override
	public List<MusicDto> selectList() {
		String sql = "select * from music order by music_no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	@Override
	public List<MusicDto> selectList(String type, String keyword) {
		String sql = "select * from music "
								+ "where instr("+type+", ?) > 0 "
								+ "order by "+type+" asc";
		Object[] param = {keyword};
		return jdbcTemplate.query(sql, mapper, param);
	}
	
	private ResultSetExtractor<MusicDto> extractor = new ResultSetExtractor<MusicDto>() {
		@Override
		public MusicDto extractData(ResultSet rs) throws SQLException, DataAccessException {
			if(rs.next()) {
				MusicDto dto = new MusicDto();
				dto.setMusicNo(rs.getInt("music_no"));
				dto.setMusicTitle(rs.getString("music_title"));
				dto.setMusicArtist(rs.getString("music_artist"));
				dto.setMusicAlbum(rs.getString("music_album"));
				dto.setMusicPlay(rs.getInt("music_play"));
				dto.setReleaseTime(rs.getDate("release_time"));
				return dto;
			}
			else {
				return null;
			}
		}
	};
	
	@Override
	public MusicDto selectOne(int musicNo) {
		String sql = "select * from music where music_no = ?";
		Object[] param = {musicNo};
		return jdbcTemplate.query(sql, extractor, param);
	}
	
	@Override
	public boolean update(MusicDto musicDto) {
		String sql = "update music "
							+ "set "
								+ "music_title = ?, "
								+ "music_artist = ?, "
								+ "music_album = ?,"
								+ "release_time = ? "
							+ "where "
								+ "music_no = ?";
		Object[] param = {
			musicDto.getMusicTitle(), musicDto.getMusicArtist(),
			musicDto.getMusicAlbum(), musicDto.getReleaseTime(),
			musicDto.getMusicNo()
		};
		return jdbcTemplate.update(sql, param) > 0;
	}
}