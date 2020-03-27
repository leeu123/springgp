package com.gpspring.web.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class GpController {
	
	@RequestMapping("/")
	public String home() { // �ε��� ������
		
		return "gpindex"; // �ڱⰡ ���� jsp ���� ���
	}
	
	@RequestMapping("/index")
	public String index() { // �ε��� ������
		
		return "gpindex"; // �ڱⰡ ���� jsp ���� ���
	}
	
	@RequestMapping("/aboutus")
	public String aboutus() { // ��������Ʈ ������
		
		return "aboutus"; // �ڱⰡ ���� jsp ���� ���
	}
	
	@RequestMapping("/masjib")
	public String masjib() { // ��������Ʈ ������
		
		return "masjib"; // �ڱⰡ ���� jsp ���� ���
	}
	
	@RequestMapping("/party")
	public String party() { // �������� ��Ƽ ����Ʈ ������
		 
		return "party"; // �ڱⰡ ���� jsp ���� ���
	}
	
	@RequestMapping("/party1")
	public String party1() { // �Ϸ�� ��Ƽ ����Ʈ ������
		
		return "party1"; // �ڱⰡ ���� jsp ���� ���
	}
	
	@RequestMapping("/partyregi")
	public String partyregi() { // ��Ƽ ���� ������
		
		return "partyregi"; // �ڱⰡ ���� jsp ���� ���
	}
	
	@RequestMapping("/loginpage")
	public String loginpage() {
		
		return "loginpage"; // �ڱⰡ ���� jsp ���� ���
	}
//	
//	@RequestMapping("/infosearch")
//	public String infosearch() {
//		
//		return "infosearch"; // �ڱⰡ ���� jsp ���� ���
//	}
	
	@RequestMapping("/membership")
	public String membership() {
		
		return "membership"; // �ڱⰡ ���� jsp ���� ���
	}
	
	@RequestMapping("/license")
	public String license() {
		
		return "license"; // �ڱⰡ ���� jsp ���� ���
	}

}
