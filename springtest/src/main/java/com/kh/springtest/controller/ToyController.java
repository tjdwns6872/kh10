package com.kh.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.springtest.repository.ToyDao;

@Controller
public class ToyController {
	//우성준
	@Autowired
	private ToyDao toyDao;
	
	@GetMapping("/")
	public String toy(Model model) {
		model.addAttribute("list", toyDao.selectList());
		return "list";
	}
}
