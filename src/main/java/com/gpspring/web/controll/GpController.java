package com.gpspring.web.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class GpController {
	
	@RequestMapping("/")
	public String home() { // 인덱스 페이지
		
		return "gpindex"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/index")
	public String index() { // 인덱스 페이지
		
		return "gpindex"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/aboutus")
	public String aboutus() { // 맛집리스트 페이지
		
		return "aboutus"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/masjib")
	public String masjib() { // 맛집리스트 페이지
		
		return "masjib"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/party")
	public String party() { // 진행중인 파티 리스트 페이지
		 
		return "party"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/party1")
	public String party1() { // 완료된 파티 리스트 페이지
		
		return "party1"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/partyregi")
	public String partyregi() { // 파티 모집 페이지
		
		return "partyregi"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/loginpage")
	public String loginpage() {
		
		return "loginpage"; // 자기가 만든 jsp 파일 경로
	}
//	
//	@RequestMapping("/infosearch")
//	public String infosearch() {
//		
//		return "infosearch"; // 자기가 만든 jsp 파일 경로
//	}
	
	@RequestMapping("/membership")
	public String membership() {
		
		return "membership"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/license")
	public String license() {
		
		return "license"; // 자기가 만든 jsp 파일 경로
	}

}
