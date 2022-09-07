package com.kh.springhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.entity.MusicDto;
import com.kh.springhome.repository.MusicDao;

@Controller
@RequestMapping("/music")
public class MusicController {

	
	@Autowired
	private MusicDao musicDao;
	
	@GetMapping("/insert")
	public String insert() {
		return "music/insert";
	}
	@PostMapping("/insert")
	public String insert(@ModelAttribute MusicDto musicDto) {
		musicDao.insert(musicDto);
		return "redirect:insert_success";
	}
	@GetMapping("/insert_success")
	public String insertSuccess() {
		return "music/insertSuccess";
	}
	
	@GetMapping("/list")
	public String list(Model model,
				@RequestParam(required = false) String type,
				@RequestParam(required = false) String keyword) {
		boolean isSearch = type != null && keyword != null;
		if(isSearch) {
			model.addAttribute("list", musicDao.selectList(type, keyword));
		}else {
			model.addAttribute("list", musicDao.selectList());
		}
		return "music/list";
	}
	
	@GetMapping("/detail")
	public String detail(Model model,
			@RequestParam int no) {
		MusicDto dto = musicDao.selectOne(no);
		model.addAttribute("dto", dto);
		return "music/detail";
	}
	
}