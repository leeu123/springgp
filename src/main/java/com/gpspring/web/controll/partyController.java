package com.gpspring.web.controll;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gpspring.web.service.PartyService;
import com.gpspring.web.vo.PartyDTO;

@Controller
public class partyController {

	@Autowired
	private PartyService paSer;

	@RequestMapping(value = "/partyregist", method = { RequestMethod.GET, RequestMethod.POST })
	public String partyregist(HttpSession session, Model model, @ModelAttribute PartyDTO padto) { // 吏꾪뻾以묒씤 �뙆�떚 移댄뀒怨좊━ 蹂� �뙆�떚

		String id = (String) session.getAttribute("id");
		String nick = (String) session.getAttribute("nick");
		padto.setId(id);
		padto.setNick(nick);
		boolean ok = paSer.partyregist(padto);

		if (ok) {

			return "party"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
		}
		model.addAttribute("message", "�엯�젰�뿉 �삤瑜섍� �엳�뒿�땲�떎.");
		return "partyregi";
	}

	@RequestMapping(value = "/partycate", method = { RequestMethod.GET, RequestMethod.POST })
	public String partycate(Model model, @RequestParam String cate,HttpServletResponse response) { // 吏꾪뻾以묒씤 �뙆�떚 移댄뀒怨좊━ 蹂� �뙆�떚

		ArrayList<PartyDTO> palist = paSer.partycate(cate);
		System.out.println(palist.get(0).getPnum());
//		if (palist.size() > 0) {
			model.addAttribute("palist", palist);

			return "partycate"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
		
	}

	@RequestMapping(value = "/partycatere", method = { RequestMethod.GET, RequestMethod.POST })
	public String partycatere(Model model, @RequestParam String cate) { // �셿猷뚮맂 �뙆�떚 移댄뀒怨좊━ 蹂� �뙆�떚

		ArrayList<PartyDTO> palist = paSer.partycatere(cate);
		System.out.println(palist.get(0).getPnum());
		model.addAttribute("palist", palist);
 
		return "partycatere"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}

	@RequestMapping(value = "/partyinfo", method = { RequestMethod.GET, RequestMethod.POST })
	public String partyinfo(Model model, @RequestParam int pnum) { // 吏꾪뻾以묒씤 �뙆�떚 媛쒕퀎 �뙆�떚 �젙蹂�

		PartyDTO painfo = paSer.partyinfo(pnum);

		model.addAttribute("painfo", painfo);

		return "partyinfo"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}

	@RequestMapping(value = "/partyinfore", method = { RequestMethod.GET, RequestMethod.POST })
	public String partyinfore(Model model, @RequestParam int pnum) { // �셿猷뚮맂 �뙆�떚 媛쒕퀎 �뙆�떚 �젙蹂�

		PartyDTO painfore = paSer.partyinfore(pnum);

		model.addAttribute("painfore", painfore);

		return "partyinfore"; // �옄湲곌� 留뚮뱺 jsp �뙆�씪 寃쎈줈
	}

}
