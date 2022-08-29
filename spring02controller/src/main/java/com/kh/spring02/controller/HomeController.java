package com.kh.spring02.controller;

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
}
