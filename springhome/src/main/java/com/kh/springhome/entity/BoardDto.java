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
	// 계층형 게시판 데이터
	// (참고) boardParent는 null일 수 있지만 JDBC에서 0으로 변환(Integer로 생성해야 됨)
	private int boardGroup, boardParent, boardDepth;
}
