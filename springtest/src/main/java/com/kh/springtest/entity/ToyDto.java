package com.kh.springtest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ToyDto {
	int toyNo;
	String toyName;
	int toyPrice;
}
