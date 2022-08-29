package com.kh.spring03.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quiz")//공용주소
public class ControllerQuiz {
	@RequestMapping("/bmi")
	@ResponseBody
	public String bmi(@RequestParam int cm, 
			@RequestParam double kg) {
		double m = cm / 100.0;
		double bmi = kg/(m*m);
		return "bmi : "+bmi;
	}
	
	@RequestMapping("/subway")
	@ResponseBody
	public String subway(@RequestParam int year) {
		int price = 0;
		int age = 2022 - year + 1;
		if(age < 8 || age >= 65) {
			price = 0;
		}else if(age >= 20) {
			price = 1250;
		}else if(age >= 14) {
			price = 720;
		}else {
			price = 450;
		}
		
		return "가격 : "+price;
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
