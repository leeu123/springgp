package com.gpspring.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gpspring.web.vo.*;

@Repository
public class RestaurantDAO {

	@Autowired
	private SqlSession sq; // ?‹±ê¸??†¤ ê°ì²´

	public List<ResdatDTO> selectlistmasjip() { // ?‰?  ë² ìŠ¤?Š¸ 10?œ¼ë¡? ?‰? ê³? ?‹?‹¹ë²ˆí˜¸(rnum)?„ ?“¤ê³ ì˜¤ê¸? ?œ„?•¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjip");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkor() { // ?•œ?‹ ?‰?  ë² ìŠ¤?Š¸ 10?œ¼ë¡? ?‰? ê³? ?‹?‹¹ë²ˆí˜¸(rnum)?„ ?“¤ê³ ì˜¤ê¸? ?œ„?•¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipkor");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipchn() { // ì¤‘ì‹ ?‰?  ë² ìŠ¤?Š¸ 10?œ¼ë¡? ?‰? ê³? ?‹?‹¹ë²ˆí˜¸(rnum)?„ ?“¤ê³ ì˜¤ê¸? ?œ„?•¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipchn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjpn() { // ì¤‘ì‹ ?‰?  ë² ìŠ¤?Š¸ 10?œ¼ë¡? ?‰? ê³? ?‹?‹¹ë²ˆí˜¸(rnum)?„ ?“¤ê³ ì˜¤ê¸? ?œ„?•¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipjpn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipwest() { // ì¤‘ì‹ ?‰?  ë² ìŠ¤?Š¸ 10?œ¼ë¡? ?‰? ê³? ?‹?‹¹ë²ˆí˜¸(rnum)?„ ?“¤ê³ ì˜¤ê¸? ?œ„?•¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipwest");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipworld() { // ì¤‘ì‹ ?‰?  ë² ìŠ¤?Š¸ 10?œ¼ë¡? ?‰? ê³? ?‹?‹¹ë²ˆí˜¸(rnum)?„ ?“¤ê³ ì˜¤ê¸? ?œ„?•¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipworld");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipwhat() { // ì¤‘ì‹ ?‰?  ë² ìŠ¤?Š¸ 10?œ¼ë¡? ?‰? ê³? ?‹?‹¹ë²ˆí˜¸(rnum)?„ ?“¤ê³ ì˜¤ê¸? ?œ„?•¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipwhat");

		if (list != null) {
			return list;
		}
		return null;
	}

	public RestaurantDTO selectRestau(int rnum) { // ?‰?  ë² ìŠ¤?Š¸10?—?„œ ?‹?‹¹? •ë³? ?“¤ê³? ?˜¤ê¸? ?œ„?•œ ë©”ì†Œ?“œ rnum?œ¼ë¡? ?‹?‹¹? •ë³?
		RestaurantDTO list = null;

		list = sq.selectOne("selectRestau", rnum);

		if (list != null) {
			return list;
		}
		return null;
	}

	public ResdatDTO selectResdat(int rnum) { // ?‰?  ë² ìŠ¤?Š¸10?—?„œ ?‹?‹¹? •ë³? ?“¤ê³? ?˜¤ê¸? ?œ„?•œ ë©”ì†Œ?“œ rnum?œ¼ë¡? ?‹?‹¹? •ë³?
		ResdatDTO list = null;

		list = sq.selectOne("selectResdat", rnum);

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<RestaurantDTO> selectViewtop() { // ì¡°íšŒ?ˆœ?œ¼ë¡? ë² ìŠ¤?Š¸ 10 ?‹?‹¹? •ë³?
		List<RestaurantDTO> list = null;

		list = sq.selectList("selectViewtop");

		if (list != null) {
			return list;
		}
		return null;

	}

	public List<RestaurantDTO> navsearch(RestaurantDTO dtoad) {
		System.out.println("");
		List<RestaurantDTO> list = null;

		list = sq.selectList("navsearch", dtoad);
		System.out.println("aa" + list.size());

		return list;
	}

	public List<RestaurantDTO> navlistcount(RestaurantDTO dtoad) {
		System.out.println("");
		List<RestaurantDTO> list = null;

		list = sq.selectList("navlistcount", dtoad);

		return list;
	}

	public List<ResdatDTO> selectlistmasjipseoul() { // ?„œ?š¸ ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipseoul");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipdj() { // ??? „ ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipdj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipgj() { // ê´‘ì£¼ ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipgj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipbs() { // ë¶??‚° ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipbs");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkk() { // ê²½ê¸° ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkk");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkw() { // ê°•ì› ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkw");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipcb() { // ì¶©ë¶ ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipcb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipcn() { // ì¶©ë‚¨ ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipcn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipic() { // ?¸ì²? ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipic");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipsj() { // ?„¸ì¢? ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipsj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipus() { // ?š¸?‚° ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipus");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkn() { // ê²½ë‚¨ ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkb() { // ê²½ë¶ ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipdg() { // ??êµ? ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipdg");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjn() { // ? „?‚¨ ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjb() { // ? „ë¶? ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjj() { // ? œì£? ë§›ì§‘ ë² ìŠ¤?Š¸ 10 ? •ë³´ë??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjj");

		if (list != null) {
			return list;
		}
		return null;
	}

}
