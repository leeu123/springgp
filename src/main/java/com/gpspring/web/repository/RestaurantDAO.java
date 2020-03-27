package com.gpspring.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gpspring.web.vo.*;

@Repository
public class RestaurantDAO {

	@Autowired
	private SqlSession sq; // ?���??�� 객체

	public List<ResdatDTO> selectlistmasjip() { // ?��?�� 베스?�� 10?���? ?��?���? ?��?��번호(rnum)?�� ?��고오�? ?��?��
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjip");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkor() { // ?��?�� ?��?�� 베스?�� 10?���? ?��?���? ?��?��번호(rnum)?�� ?��고오�? ?��?��
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipkor");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipchn() { // 중식 ?��?�� 베스?�� 10?���? ?��?���? ?��?��번호(rnum)?�� ?��고오�? ?��?��
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipchn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjpn() { // 중식 ?��?�� 베스?�� 10?���? ?��?���? ?��?��번호(rnum)?�� ?��고오�? ?��?��
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipjpn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipwest() { // 중식 ?��?�� 베스?�� 10?���? ?��?���? ?��?��번호(rnum)?�� ?��고오�? ?��?��
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipwest");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipworld() { // 중식 ?��?�� 베스?�� 10?���? ?��?���? ?��?��번호(rnum)?�� ?��고오�? ?��?��
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipworld");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipwhat() { // 중식 ?��?�� 베스?�� 10?���? ?��?���? ?��?��번호(rnum)?�� ?��고오�? ?��?��
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipwhat");

		if (list != null) {
			return list;
		}
		return null;
	}

	public RestaurantDTO selectRestau(int rnum) { // ?��?�� 베스?��10?��?�� ?��?��?���? ?���? ?���? ?��?�� 메소?�� rnum?���? ?��?��?���?
		RestaurantDTO list = null;

		list = sq.selectOne("selectRestau", rnum);

		if (list != null) {
			return list;
		}
		return null;
	}

	public ResdatDTO selectResdat(int rnum) { // ?��?�� 베스?��10?��?�� ?��?��?���? ?���? ?���? ?��?�� 메소?�� rnum?���? ?��?��?���?
		ResdatDTO list = null;

		list = sq.selectOne("selectResdat", rnum);

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<RestaurantDTO> selectViewtop() { // 조회?��?���? 베스?�� 10 ?��?��?���?
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

	public List<ResdatDTO> selectlistmasjipseoul() { // ?��?�� 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipseoul");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipdj() { // ???�� 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipdj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipgj() { // 광주 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipgj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipbs() { // �??�� 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipbs");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkk() { // 경기 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkk");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkw() { // 강원 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkw");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipcb() { // 충북 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipcb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipcn() { // 충남 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipcn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipic() { // ?���? 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipic");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipsj() { // ?���? 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipsj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipus() { // ?��?�� 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipus");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkn() { // 경남 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkb() { // 경북 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipdg() { // ??�? 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipdg");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjn() { // ?��?�� 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjb() { // ?���? 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjj() { // ?���? 맛집 베스?�� 10 ?��보�??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjj");

		if (list != null) {
			return list;
		}
		return null;
	}

}
