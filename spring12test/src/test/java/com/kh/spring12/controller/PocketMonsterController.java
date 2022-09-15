package com.kh.spring12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pocketmon")
public class PocketMonsterController {
	
	@GetMapping("/insert")
	public String insert() {
//		return "/WEB-INF/views/pocketmon/insert.jsp";
		return "pocketmon/insert";
	}
	
}