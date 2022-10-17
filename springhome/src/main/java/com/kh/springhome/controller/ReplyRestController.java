package com.kh.springhome.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.springhome.constant.SessionConstant;
import com.kh.springhome.entity.ReplyDto;
import com.kh.springhome.repository.ReplyDao;
import com.kh.springhome.vo.ReplyListVO;

@RestController
@CrossOrigin
@RequestMapping("/rest/reply")
public class ReplyRestController {

	@Autowired
	private ReplyDao replyDao;
	
//	등록(insert)
//	- 필요 정보를 받아서 등록한 뒤 사용자에게 목록을 전
	@PostMapping("/insert")
	public List<ReplyListVO> insert(@ModelAttribute ReplyDto replyDto,
			HttpSession session) {
		String memberId = (String)session.getAttribute(SessionConstant.ID);
		replyDto.setReplyWriter(memberId);
		replyDao.insert(replyDto);
		
		return replyDao.selectList(replyDto.getReplyOrigin());
		
	}
}


















