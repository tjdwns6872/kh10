package com.kh.springhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.springhome.entity.GuestBookDto;
import com.kh.springhome.repository.GuestBookDao;

@Controller
@RequestMapping("/guestbook")
public class GuestBookController {

	@Autowired
	private GuestBookDao guestBookDao;
	
	@GetMapping("/insert")
	public String insert() {
		return "guestbook/insert";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute GuestBookDto dto) {
		guestBookDao.insert(dto);
		return "redirect:insert_success";
	}
	
	@RequestMapping("/insert_success")
	public String insertSucces() {
		return "guestbook/insertResult";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		List<GuestBookDto> list = guestBookDao.tableList();
		model.addAttribute("list", list);
		return "guestbook/list";
	}
}
