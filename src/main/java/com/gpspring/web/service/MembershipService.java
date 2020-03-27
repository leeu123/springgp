package com.gpspring.web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpspring.web.repository.MembershipDAO;
import com.gpspring.web.vo.MembershipDTO;

@Service
public class MembershipService {
	
	
	@Autowired
	private MembershipDAO mbDAO;
	
	
	public String login(MembershipDTO s) {
		 
		String t = mbDAO.loginAction(s);
		
		return t;

	}
	
	
	
	
	

}
