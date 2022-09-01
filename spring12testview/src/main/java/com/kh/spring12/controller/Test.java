package com.kh.spring12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	@RequestMapping("/test")
	public String test() {
		return "tag/test.jsp";
	}
	
	@RequestMapping("/test02")
	public String test02() {
		return "tag/test02.jsp";
	}
}
