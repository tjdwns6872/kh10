package com.kh.springhome.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ReplyDto {
	private String replyWriter, replyContent;
	private Date replyWritetime;
	private int replyNo, replyOrigin;
	private boolean replyBlind;
}
