package com.gpspring.web.controll;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gpspring.web.service.MasjipService;
import com.gpspring.web.vo.ResdatDTO;


@Controller
public class masjibController {
	
	
	@Autowired
	private MasjipService mjSer;

	@RequestMapping("/masjiprec")
	public String masjiprec(Model model) { // �룊�젏 �닚 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjiprec();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjiprec"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipviewtop")
	public String masjipviewtop(Model model) { // 議고쉶�닔 �닚 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipviewtop();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipviewtop"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipkor")
	public String masjipkor(Model model) { // �븳�떇 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipkor();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipkor"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipjpn")
	public String masjipjpn(Model model) { // �씪�떇 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipjpn();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipjpn"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipchn")
	public String masjipchn(Model model) { // 以묒떇 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipchn();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipchn"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}
	
	@RequestMapping("/masjipwest")
	public String masjipwest(Model model) { // 以묒떇 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipwest();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipwest"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	
	@RequestMapping("/masjipworld")
	public String masjipworld(Model model) { // �꽭怨꾩쓬�떇 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipworld();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipworld"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipwhat")
	public String masjipwhat(Model model) { // 酉뷀럹 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipwhat();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipwhat"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipseoul")
	public String masjipseoul(Model model) { // �꽌�슱 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipseoul();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipseoul"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipdj")
	public String masjipdj(Model model) { // ���쟾 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipdj();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipdj"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipgj")
	public String masjipgj(Model model) { // 愿묒＜ 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipgj();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipgj"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipbs")
	public String masjipbs(Model model) { // 遺��궛 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipbs();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipbs"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipcb")
	public String masjipcb(Model model) { // 異⑸턿 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipcb();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipcb"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipcn")
	public String masjipcn(Model model) { // 異⑸궓 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipcn();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipcn"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipdg")
	public String masjipdg(Model model) { // ��援� 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipdg();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipdg"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipic")
	public String masjipic(Model model) { // �씤泥� 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipic();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipic"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipjb")
	public String masjipjb(Model model) { // �쟾遺� 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipjb();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipjb"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipjj")
	public String masjipjj(Model model) { // �젣二� 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipjj();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipjj"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipjn")
	public String masjipjn(Model model) { // �쟾�궓 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipjn();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipjn"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipkb")
	public String masjipkb(Model model) { // 寃쎈턿 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipkb();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipkb"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipkk")
	public String masjipkk(Model model) { // 寃쎄린 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipkk();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipkk"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipkn")
	public String masjipkn(Model model) { // 寃쎈궓 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipkn();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipkn"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipkw")
	public String masjipkw(Model model) { // 媛뺤썝 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipkw();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipkw"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipsj")
	public String masjipsj(Model model) { // �꽭醫� 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipsj();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipsj"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	@RequestMapping("/masjipus")
	public String masjipus(Model model) { // �슱�궛 留쏆쭛 踰좎뒪�듃 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipus();
		
		model.addAttribute("rslist",rslist);		
				
		return "masjipus"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}	
	
	
	
	
}
