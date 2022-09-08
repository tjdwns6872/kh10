package com.kh.springhome.entity;

import java.sql.Date;

public class MusicDto {
	private int musicNo;
	private String musicTitle, musicAlbum, musicArtist;
	private int musicPlay;
	private Date releaseTime;
	@Override
	public String toString() {
		return "MusicDto [musicNo=" + musicNo + ", musicTitle=" + musicTitle + ", musicAlbum=" + musicAlbum
				+ ", musicArtist=" + musicArtist + ", musicPlay=" + musicPlay + ", releaseTime=" + releaseTime + "]";
	}
	public MusicDto() {
		super();
	}
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
	public String getMusicAlbum() {
		return musicAlbum;
	}
	public void setMusicAlbum(String musicAlbum) {
		this.musicAlbum = musicAlbum;
	}
	public String getMusicArtist() {
		return musicArtist;
	}
	public void setMusicArtist(String musicArtist) {
		this.musicArtist = musicArtist;
	}
	public int getMusicPlay() {
		return musicPlay;
	}
	public void setMusicPlay(int musicPlay) {
		this.musicPlay = musicPlay;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
}
