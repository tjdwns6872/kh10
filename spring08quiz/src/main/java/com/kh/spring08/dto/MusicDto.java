package com.kh.spring08.dto;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class MusicDto {
	private int musicNo;
	private String musicTitle;
	private String musicArtist;
	private String musicAlbum;
	private int musicPlay;
	private String releaseTime;
	public int getMusicNo() {
		return musicNo;
	}
	public void setMusicNo(int musicNo) {
		this.musicNo = musicNo;
	}
	public String getMusicTitle() {
		return musicTitle;
	}
	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}
	public String getMusicArtist() {
		return musicArtist;
	}
	public void setMusicArtist(String musicArtist) {
		this.musicArtist = musicArtist;
	}
	public String getMusicAlbum() {
		return musicAlbum;
	}
	public void setMusicAlbum(String musicAlbum) {
		this.musicAlbum = musicAlbum;
	}
	public int getMusicPlay() {
		return musicPlay;
	}
	public void setMusicPlay(int musicPlay) {
		this.musicPlay = musicPlay;
	}
	public String getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}
	public MusicDto() {
		super();
	}
	private static RowMapper<MusicDto> mapper = (rs, idx) ->{
		MusicDto dto = new MusicDto();
		dto.setMusicNo(rs.getInt("music_no"));
		dto.setMusicTitle(rs.getString("music_title"));
		dto.setMusicArtist(rs.getString("music_artist"));
		dto.setMusicAlbum(rs.getString("music_album"));
		dto.setMusicPlay(rs.getInt("music_play"));
		dto.setReleaseTime(rs.getNString("release_time"));
		return dto;
	};
	public static RowMapper<MusicDto> getMapper() {
		return mapper;
	}
	
	private static ResultSetExtractor<MusicDto> extractor = (rs) -> {
		MusicDto dto = new MusicDto();
		if(rs.next()) {
			dto.setMusicNo(rs.getInt("music_no"));
			dto.setMusicTitle(rs.getString("music_title"));
			dto.setMusicArtist(rs.getString("music_artist"));
			dto.setMusicAlbum(rs.getString("music_album"));
			dto.setMusicPlay(rs.getInt("music_play"));
			dto.setReleaseTime(rs.getNString("release_time"));
			return dto;
		}else {
			return null;
		}
	};
	public static ResultSetExtractor<MusicDto> getExtractor() {
		return extractor;
	}
}
