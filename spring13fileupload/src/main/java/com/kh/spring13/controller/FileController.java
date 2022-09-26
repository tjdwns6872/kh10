package com.kh.spring13.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	
	@GetMapping("/")
	public String root() {
		return "root";
	}
	
	//컨트롤러에서의 파일 수신 처리
	// -> multipart Request를 처리한다고 부름
	// -> Spring boot에서 내부적으로 multipartResolver를 등록
	// -> Spring Controller에서는 MultipartFile 형태로 파일을 수신
	// -> 기존에 사용하던 annotation 전부 지원
	@PostMapping("/")
	public String upload(
			@RequestParam String uploader,
			@RequestParam MultipartFile attachment) throws IllegalStateException, IOException {
		System.out.println("uploader = "+uploader);
		System.out.println("attachment = "+attachment);
		// attachment 분석
		System.out.println("content type = "+attachment.getContentType());
		System.out.println("name = "+attachment.getName());
		System.out.println("original file name = "+attachment.getOriginalFilename());
		System.out.println("size = "+attachment.getSize());
		
		//사용자가 올린 파일을 저장
		File directory = new File("C:/Users/tjdwn/upload"); //업로드할 폴더 선택
		directory.mkdir(); //폴더 생성 명령
		File target = new File(directory, attachment.getOriginalFilename()); //저장될 파일 생성
		attachment.transferTo(target); // 실제 저장 처리 명령
		
		return "redirect:/";
		
	}
	
}
