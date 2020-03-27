package com.gpspring.web.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gpspring.web.vo.MembershipDTO;


@Repository
public class MembershipDAO {
	
	
	@Autowired
	private SqlSession sql; // �떛湲��넠 媛앹껜
	
	
	public String loginAction(MembershipDTO mb) {

		try {
			String s = sql.selectOne("login", mb);
			
			if(s!=null) {

			return s;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	

}
