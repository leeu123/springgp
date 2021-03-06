package com.gpspring.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gpspring.web.vo.*;

@Repository
public class RestaurantDAO {

	@Autowired
	private SqlSession sq; // ?±κΈ??€ κ°μ²΄

	public List<ResdatDTO> selectlistmasjip() { // ??  λ² μ€?Έ 10?Όλ‘? ?? κ³? ??Ήλ²νΈ(rnum)? ?€κ³ μ€κΈ? ??¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjip");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkor() { // ?? ??  λ² μ€?Έ 10?Όλ‘? ?? κ³? ??Ήλ²νΈ(rnum)? ?€κ³ μ€κΈ? ??¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipkor");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipchn() { // μ€μ ??  λ² μ€?Έ 10?Όλ‘? ?? κ³? ??Ήλ²νΈ(rnum)? ?€κ³ μ€κΈ? ??¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipchn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjpn() { // μ€μ ??  λ² μ€?Έ 10?Όλ‘? ?? κ³? ??Ήλ²νΈ(rnum)? ?€κ³ μ€κΈ? ??¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipjpn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipwest() { // μ€μ ??  λ² μ€?Έ 10?Όλ‘? ?? κ³? ??Ήλ²νΈ(rnum)? ?€κ³ μ€κΈ? ??¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipwest");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipworld() { // μ€μ ??  λ² μ€?Έ 10?Όλ‘? ?? κ³? ??Ήλ²νΈ(rnum)? ?€κ³ μ€κΈ? ??¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipworld");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipwhat() { // μ€μ ??  λ² μ€?Έ 10?Όλ‘? ?? κ³? ??Ήλ²νΈ(rnum)? ?€κ³ μ€κΈ? ??¨
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipwhat");

		if (list != null) {
			return list;
		}
		return null;
	}

	public RestaurantDTO selectRestau(int rnum) { // ??  λ² μ€?Έ10?? ??Ή? λ³? ?€κ³? ?€κΈ? ?? λ©μ? rnum?Όλ‘? ??Ή? λ³?
		RestaurantDTO list = null;

		list = sq.selectOne("selectRestau", rnum);

		if (list != null) {
			return list;
		}
		return null;
	}

	public ResdatDTO selectResdat(int rnum) { // ??  λ² μ€?Έ10?? ??Ή? λ³? ?€κ³? ?€κΈ? ?? λ©μ? rnum?Όλ‘? ??Ή? λ³?
		ResdatDTO list = null;

		list = sq.selectOne("selectResdat", rnum);

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<RestaurantDTO> selectViewtop() { // μ‘°ν??Όλ‘? λ² μ€?Έ 10 ??Ή? λ³?
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

	public List<ResdatDTO> selectlistmasjipseoul() { // ??Έ λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipseoul");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipdj() { // ???  λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipdj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipgj() { // κ΄μ£Ό λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipgj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipbs() { // λΆ??° λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipbs");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkk() { // κ²½κΈ° λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkk");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkw() { // κ°μ λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkw");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipcb() { // μΆ©λΆ λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipcb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipcn() { // μΆ©λ¨ λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipcn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipic() { // ?Έμ²? λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipic");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipsj() { // ?Έμ’? λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipsj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipus() { // ?Έ?° λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipus");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkn() { // κ²½λ¨ λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkb() { // κ²½λΆ λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipdg() { // ??κ΅? λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipdg");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjn() { // ? ?¨ λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjb() { // ? λΆ? λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjj() { // ? μ£? λ§μ§ λ² μ€?Έ 10 ? λ³΄λ??
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjj");

		if (list != null) {
			return list;
		}
		return null;
	}

}
