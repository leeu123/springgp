package com.gpspring.web.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpspring.web.repository.PartyDAO;
import com.gpspring.web.vo.PartyDTO;

@Service
public class PartyService {
	
	@Autowired
	private PartyDAO paDAO;
	
	
	public boolean partyregist(PartyDTO padto) {
		 
		boolean ok = paDAO.partyregist(padto);
		
		return ok;

	}
	
	public ArrayList<PartyDTO> partycate(String cate) {
		 
		ArrayList<PartyDTO> palist = (ArrayList<PartyDTO>)paDAO.partycate(cate);
		
		return palist;

	}
	
	public ArrayList<PartyDTO> partycatere(String cate) {
		 
		ArrayList<PartyDTO> palist = (ArrayList<PartyDTO>)paDAO.partycatere(cate);
		
		return palist;

	}
	
	public PartyDTO partyinfo(int pnum) {
		 
		PartyDTO palist = (PartyDTO)paDAO.partyinfo(pnum);
		
		return palist;

	}
	
	public PartyDTO partyinfore(int pnum) {
		 
		PartyDTO palist = (PartyDTO)paDAO.partyinfore(pnum);
		
		return palist;

	}
	
	
	

}
