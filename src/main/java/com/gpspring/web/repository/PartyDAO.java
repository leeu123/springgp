package com.gpspring.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gpspring.web.vo.PartyDTO;


@Repository
public class PartyDAO {
	
	@Autowired
	private SqlSession sql; // ?ã±Í∏??Ü§ Í∞ùÏ≤¥
	
	public boolean partyregist(PartyDTO padto) {

		try {
			sql.insert("partyregi",padto);
			
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public List<PartyDTO> partycate(String cate) {

		try {
			List<PartyDTO> palist = sql.selectList("partycate",cate);
			
			if(palist.size()!=0) {

			return palist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<PartyDTO> partycatere(String cate) {

		try {
			List<PartyDTO> palist = sql.selectList("partycatere",cate);
			
			if(palist.size()!=0) {

			return palist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public PartyDTO partyinfo(int pnum) {

		try {
			PartyDTO painfo = sql.selectOne("partyinfo",pnum);
			
			if(painfo!=null) {

			return painfo;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public PartyDTO partyinfore(int pnum) {

		try {
			PartyDTO painfore = sql.selectOne("partyinfore",pnum);
			
			if(painfore!=null) {

			return painfore;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	

}
