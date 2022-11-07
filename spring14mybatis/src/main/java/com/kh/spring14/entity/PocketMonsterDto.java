package com.kh.spring14.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PocketMonsterDto {
	private int no;
	private String name;
	private String type;

}
