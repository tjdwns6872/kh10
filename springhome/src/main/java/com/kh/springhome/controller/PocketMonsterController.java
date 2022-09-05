package com.kh.springhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.springhome.entity.PocketMonsterDto;
import com.kh.springhome.repository.PocketMonsterDao;

@Controller
@RequestMapping("/pocketmon")
public class PocketMonsterController {

	@Autowired	//약결합을 위해 Dao 주세요 (DaoImpl → 강결합)
	private PocketMonsterDao pocketMonsterDao;
	
	//등록 기능은 매핑이 2개가 필요한데 주소는 같을 수 없다
	//주소를 맞추려면 방식이라도 달라야 하므로 구분해야 한다
	//옵션이 1개일 때는 옵션명을 안 적어도 되지만, 2개이상부터는 적어야 함
//	@RequestMapping(value = "/insert", method = RequestMethod.Get)
//	@RequestMapping(value = "/insert", method = RequestMethod.Post)
	
	@GetMapping("/insert")
	public String insert() {
		return "pocketmon/insert";
	}

	@PostMapping("/insert")
	public String insert(@ModelAttribute PocketMonsterDto dto) {
		//DB insert
		pocketMonsterDao.insert(dto);
//		insert_success 매핑으로 redirect(강제이동) 처리하세요
		return "redirect:insert_success";
	}
	
	@RequestMapping("/insert_success")
	public String insertSuccess() {
		return "pocketmon/insertResult";
	}
	
}
