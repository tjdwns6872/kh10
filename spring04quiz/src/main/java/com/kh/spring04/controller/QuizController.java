package com.kh.spring04.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	@RequestMapping("/sum")
	@ResponseBody
	public int sum(int begin, int end) {
		int sum = 0;
		for(int i = begin; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	@RequestMapping("/gugudan")
	@ResponseBody
	public String[] gugudan(int count) {
		Random rand = new Random();
		String[] gugudan = new String[count];
		for(int i = 0; i < count; i++) {
			int x = rand.nextInt(8)+2;
			int y = rand.nextInt(9)+1;
			gugudan[i] = x+"*"+y;
		}
		return gugudan;
	}
	
	@RequestMapping("/total")
	@ResponseBody
	public int total(int[] v) {
		int total = 0;
		for(int i = 0; i < v.length; i++) {
			total += v[i];
		}
		return total;
		
	}
}








