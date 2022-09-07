package com.kh.springhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
//	@GetMapping("/list")
//	public String list(Model model) {
//		List<GuestBookDto> list = guestBookDao.selectList();
//		model.addAttribute("list", list);
//		return "guestbook/list";
//	}
	
	@GetMapping("/list")
	public String list(Model model,
				@RequestParam(required = false) String type,
				@RequestParam(required = false) String keyword) {
		boolean isSearch = type != null && keyword != null;
		if(isSearch) {
			model.addAttribute("list", guestBookDao.selectList(type, keyword));
		}else {
			model.addAttribute("list", guestBookDao.selectList());
		}
		return "guestbook/list";
	}
	
	@GetMapping("/detail")
	public String detail(Model model,
			@RequestParam int no) {
		GuestBookDto dto = guestBookDao.selectOne(no);
		model.addAttribute("dto", dto);
		return "guestbook/detail";
	}
	
	@GetMapping("/edit")
	public String edit(Model model,
			@RequestParam int no) {
		GuestBookDto dto = guestBookDao.selectOne(no);
		model.addAttribute("dto", dto);
		return "guestbook/edit";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute GuestBookDto dto, 
			//redirect 전용 저장소(Model의 자식 클래스)
			RedirectAttributes attr) {
		boolean result = guestBookDao.update(dto);
		if(result) { 
			attr.addAttribute("no", dto.getNo());
//			return "redirect:detail?no="+dto.getNo();
			return "redirect:detail";
		}else {
			return "redirect:edit_fail";
		}
	}
	@GetMapping("/edit_fail")
	public String editFail() {
		return "guestbook/editFail";
	}
}








