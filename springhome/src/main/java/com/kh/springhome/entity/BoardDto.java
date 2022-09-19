package com.kh.springhome.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BoardDto {
	private int boardNo;
	private String boardHead, boardWriter, boardTitle, boardContent;
	private Date boardWritetime, boardUpdatetime;
	private int boardRead, boardLike;
}
