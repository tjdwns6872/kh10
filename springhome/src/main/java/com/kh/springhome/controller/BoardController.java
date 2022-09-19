package com.kh.springhome.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.springhome.constant.SessionConstant;
import com.kh.springhome.entity.BoardDto;
import com.kh.springhome.repository.BoardDao;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	
//	@GetMapping("/list")
//	public String list(Model model) {
//		List<BoardDto> list = boardDao.selectList();
//		model.addAttribute("list", list);
//		return "board/list";
//	}
	@GetMapping("/list")
	public String list(Model model,
			@RequestParam(required = false) String type,
			@RequestParam(required = false) String keyword) {
		boolean isSearch = type != null && keyword != null;
		if(isSearch) {
			model.addAttribute("list", boardDao.selectList(type, keyword));
		}else {
			model.addAttribute("list", boardDao.selectList());
		}
		return "board/list";
	}
	
	@GetMapping("/write")
	public String write() {
		return "board/write";
	}
	@PostMapping("/write")
	public String write(HttpSession session,
			@ModelAttribute BoardDto boardDto) {
		String writer = (String)session.getAttribute(SessionConstant.ID);
		boardDto.setBoardWriter(writer);
		boardDao.write(boardDto);
		return "redirect:detail"; 
	}
	
	@GetMapping("/detail")
	public String detail(Model model, 
			@RequestParam int boardNo) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return "board/detail";
	}
	@GetMapping("/delete")
	public String delete(int boardNo) {
		boolean result = boardDao.delete(boardNo);
		if(result) {
			return "redirect:list";			
		}else {
			return "redirect:list?error";
		}
	}
	@GetMapping("/edit")
	public String edit(Model model,
			@RequestParam int boardNo) {
		model.addAttribute("boardDto", boardDao.selectOne(boardNo));
		return "board/edit";
		
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto boardDto,
			RedirectAttributes attr) {
		boolean result = boardDao.update(boardDto);
		if(result) {
			attr.addAttribute("boardNo", boardDto.getBoardNo());
			return "redirect:detail";
		}
		return "redirect:edit_fail";
	}
}
