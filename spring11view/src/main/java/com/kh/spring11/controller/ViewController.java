package com.kh.spring11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tag")
public class ViewController {
	
	@RequestMapping("/test01")
	public String test01() {
//		return "/WEB-INF/views/tag/test01.jsp";
		return "tag/test01";
	}
	
	@RequestMapping("/test02")
	public String test02() {
//		return "/WEB-INF/views/tag/test02.jsp";
		return "tag/test02";
	}
	
	@RequestMapping("/test03")
	public String test03() {
//		return "/WEB-INF/views/tag/test03.jsp";
		return "tag/test03";
	}
	
	@RequestMapping("/test04")
	public String test04() {
//		return "/WEB-INF/views/tag/test04.jsp";
		return "tag/test04";
	}
	
	@RequestMapping("/test05")
	public String test05() {
//		return "/WEB-INF/views/tag/test05.jsp";
		return "tag/test05";
	}
	
	@RequestMapping("/test06")
	public String test06() {
//		return "/WEB-INF/views/tag/test06.jsp";
		return "tag/test06";
	}
	
	@RequestMapping("/test07")
	public String test07() {
		return "tag/test07";
	}
	
	@RequestMapping("/test08")
	public String test08() {
		return "tag/test08";
	}
	
	@RequestMapping("/test09")
	public String test09() {
		return "tag/test09";
	}
	
}









