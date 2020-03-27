package com.gpspring.web.controll;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.gpspring.web.service.MembershipService;
import com.gpspring.web.vo.MembershipDTO;


@Controller
public class loginController {
	
	@Autowired
	private MembershipService mbSer;

	@RequestMapping(value="/loginAction" , method = RequestMethod.POST)
	public String loginAction(HttpSession session,Model model,@ModelAttribute MembershipDTO mdto) { // 濡쒓렇�씤 �럹�씠吏�
		
		String nick =mbSer.login(mdto);
		
		if(nick!=null) {
		session.setAttribute("id", mdto.getId());
		session.setAttribute("nick", nick);
		return "redirect:/index";
		}
		else {
		model.addAttribute("message", "鍮꾨�踰덊샇 遺덉씪移�");
		return "loginpage"; 
		}
	}
	
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) { // �씤�뜳�뒪 �럹�씠吏�
		
		
		session.invalidate();
		
		
		
		return "redirect:/index"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}

	
	

}
