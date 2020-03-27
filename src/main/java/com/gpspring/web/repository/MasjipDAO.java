package com.gpspring.web.repository;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gpspring.web.vo.ResdatDTO;
@Repository
public class MasjipDAO {
	
	
	@Autowired
	private SqlSession sql; // �떛湲��넠 媛앹껜
	
	
	public List<ResdatDTO> masjiprec() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjiprec");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipkor() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipkor");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipjpn() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipjpn");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipchn() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipchn");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipwest() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipwest");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipviewtop() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipviewtop");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipworld() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipworld");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipwhat() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipwhat");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipseoul() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipseoul");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipdj() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipdj");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipgj() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipgj");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipbs() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipbs");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipcb() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipcb");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipcn() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipcn");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipdg() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipdg");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipic() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipic");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipjb() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipjb");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipjj() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipjj");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipjn() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipjn");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipkb() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipkb");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipkk() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipkk");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipkw() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipkw");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipsj() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipsj");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipus() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipus");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipkn() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipkn");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	
	
	
	
	

}
