package com.kh.spring22.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class MusicDto {
	private int musicNo, musicPlay;
	private String musicTitle, musicArtist, musicAlbum;
	private Date releaseTime;
}
