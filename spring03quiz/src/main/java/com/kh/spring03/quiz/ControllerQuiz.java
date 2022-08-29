package com.kh.spring03.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerQuiz {
	@RequestMapping("/bmi")
	@ResponseBody
	public double bmi(@RequestParam int cm, @RequestParam double kg) {
		double bmi = kg/(2*(cm/100.0));
		return bmi;
	}
	
	@RequestMapping("/subway")
	@ResponseBody
	public int subway(@RequestParam int year) {
		int price = 0;
		int age = 2022 - year + 1;
		if(age >= 20 && age < 65) {
			price = 1250;
		}else if(age >= 7) {
			price = 750;
		}else {
			price = 0;
		}
		
		return price;
	}
	
	@RequestMapping("/calendar")
	@ResponseBody
	public int calendar(@RequestParam int year, @RequestParam int month) {
		int day = 0;
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		}else if(month == 2) {
			day = 28;
		}else {
			day = 31;
		}
		return day;
	}
}
