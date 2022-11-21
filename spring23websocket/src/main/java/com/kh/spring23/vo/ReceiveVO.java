package com.kh.spring23.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//사용자가 그룹채팅에서 보내는 메세지를 수신하는 VO
@JsonIgnoreProperties
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ReceiveVO {
	private int type;
	private String room;
	private String text;
}



