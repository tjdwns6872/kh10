package com.kh.springhome.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.springhome.entity.MemberDto;
import com.kh.springhome.repository.MemberDao;

@Controller
@RequestMapping("/member")
public class MemberControlloer {

	@Autowired
	private MemberDao memberDao;
	
	@GetMapping("/insert")
	public String insert() {
		return "member/insert";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute MemberDto memberDto) {
		memberDao.insert(memberDto);
		return "redirect:insert_success";
	}
	
	@RequestMapping("/insert_success")
	public String insertSuccess() {
		return "member/insertSuccess";
	}
	
	@GetMapping("/list")
	public String list(Model model,
				@RequestParam(required = false) String type,
				@RequestParam(required = false) String keyword) {
		boolean isSearch = type != null && keyword != null;
		if(isSearch) {
			model.addAttribute("list", memberDao.selectList(type, keyword));
		}
		else {
			model.addAttribute("list", memberDao.selectList());
		}
		return "member/list";
	}
	
	@GetMapping("/detail")
	public String detail(Model model,
			@RequestParam String id) {
		MemberDto dto = memberDao.selectOne(id);
		model.addAttribute("dto", dto);
		return "member/detail";
	}
	@GetMapping("/edit")
	public String edit(Model model,
			@RequestParam String id) {
		model.addAttribute("dto", memberDao.selectOne(id));
		return "member/edit";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute MemberDto dto,
			RedirectAttributes attr) {
		boolean result = memberDao.update(dto);
		if(result) {
			attr.addAttribute("id", dto.getMemberId());
			return "redirect:detail";
		}else {
			return "redirect:edit_fail";
		}
	}
	@GetMapping("/edit_fail")
	public String editFail() {
		return "guestbook/editFail";
	}
	@GetMapping("/delete")
	public String delete(String id) {
		boolean result = memberDao.delete(id);
		if(result) {
			return "redirect:list";
		}else {
			return "guestbook/editFail";
		}
	}
	
	
}
