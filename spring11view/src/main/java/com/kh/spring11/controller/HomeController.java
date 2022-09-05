package com.kh.spring11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String hello() {
		return "hello";
	}
	@GetMapping("/test05")
	public String test05() {
		return "tag/test05";
	}
	@GetMapping("/test09")
	public String test09() {
		return "tag/test09";
	}
}
