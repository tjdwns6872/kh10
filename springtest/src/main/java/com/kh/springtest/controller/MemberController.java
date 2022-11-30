package com.kh.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.springtest.entity.MemberDto;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@GetMapping("/join")
	public String join() {
		return "/join";
	}
	@PostMapping("/join")
	public String join(@ModelAttribute MemberDto memberDto) {
		return "redirect:";
	}
}









