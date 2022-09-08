package com.kh.springhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/list")
	public String list(Model model) {
		List<PocketMonsterDto> list = pocketMonsterDao.selectList();
		model.addAttribute("list", list);
		return "pocketmon/list";
	}
	
	@GetMapping("/detil")
	public String detil(Model model, @RequestParam int no) {
		PocketMonsterDto dto = pocketMonsterDao.selectOnt(no);
		model.addAttribute("dto", dto);
		return "pocketmon/detil";
	}
	
	@GetMapping("/edit")
	public String edit(Model model,
			@RequestParam int no) {
		PocketMonsterDto dto = pocketMonsterDao.selectOnt(no);
		model.addAttribute("dto", dto);
		return "/pocketmon/edit";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute PocketMonsterDto dto) {
		boolean result = pocketMonsterDao.update(dto);
		if(result) {
			return "redirect:detil?no="+dto.getNo();
		}else {			
			return "redirect:edit_fail";
		}
	}
	
	@GetMapping("/edit_fail")
	public String editFail() {
		return "pocketmon/editFail";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam int no) {
		boolean result = pocketMonsterDao.delete(no);
		if(result) {
			return "redirect:list";
		}else {
			return "pocketmon/editFail";
		}
	}
}



