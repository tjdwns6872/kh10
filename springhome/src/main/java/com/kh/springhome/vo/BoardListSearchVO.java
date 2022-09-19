package com.kh.springhome.vo;

import lombok.Data;

@Data
public class BoardListSearchVO {
	private String type, keyword;
	
	public boolean isSearch() {
		return type != null && keyword != null;
	}
}