package com.kh.react.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.react.repository.MemberDao;

@CrossOrigin
@RestController
@RequestMapping("/member")
public class MemberRestController {
	
	@Autowired
	private MemberDao memberDao;
}
