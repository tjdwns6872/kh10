package com.kh.spring02.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //접속 처리 도구 등록 annotation
public class HomeController {

	@RequestMapping("/test") //매핑 생성
	@ResponseBody
	public String test() {
		return "Hello Spring Boot!";
	}
	
	@RequestMapping("/dice")
	@ResponseBody
	public String dice() {
		Random rand = new Random();
		int dice = rand.nextInt(6)+1;
		return "주사위 : " + dice;
	}
	
	@RequestMapping("/lotto")
	@ResponseBody
	public int[] lotto() {
		Random rand = new Random();
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45)+1;
		}
		return lotto;
	}
}
