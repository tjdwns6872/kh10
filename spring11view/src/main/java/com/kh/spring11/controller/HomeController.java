package com.kh.spring11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/test05")
	public String test05() {
		return "/WEB-INF/views/tag/test05.jsp";
	}
	
	@RequestMapping("/test06")
	public String test06() {
		return "/WEB-INF/views/tag/test06.jsp";
	}
}
