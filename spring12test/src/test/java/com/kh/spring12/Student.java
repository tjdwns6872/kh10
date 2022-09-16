package com.kh.spring12;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder 
public class Student {
	private String name;
	private int score;
}
