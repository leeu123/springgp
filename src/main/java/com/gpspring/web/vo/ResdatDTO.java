package com.gpspring.web.vo;

public class ResdatDTO { // �떇�떦 �뙎湲� DTO
	int dnum;
	int rnum;
	String id;
	String nick;
	int pyung;
	String dcontent;
	String date;
	double avg_pyung; // SQL濡� �뜲�씠�꽣瑜� 媛�吏�怨� �삤湲� �쐞�븳 double 媛�
	String store;   // �븳爰쇰쾲�뿉 踰좎뒪�듃 戮묎린 �쐞�븳 �떇�떦 蹂��닔 吏��젙
    String postnum;  // �븳爰쇰쾲�뿉 踰좎뒪�듃 戮묎린 �쐞�븳 �떇�떦 蹂��닔 吏��젙
	String home; // �븳爰쇰쾲�뿉 踰좎뒪�듃 戮묎린 �쐞�븳 �떇�떦 蹂��닔 吏��젙
	String dethome; // �븳爰쇰쾲�뿉 踰좎뒪�듃 戮묎린 �쐞�븳 �떇�떦 蹂��닔 吏��젙
	String file;  // �븳爰쇰쾲�뿉 踰좎뒪�듃 戮묎린 �쐞�븳 �떇�떦 蹂��닔 吏��젙
	int readcount;

	public double getAvg_pyung() {
		return avg_pyung;
	}
	public void setAvg_pyung(double avg_pyung) {
		this.avg_pyung = avg_pyung;
	}
	public int getDnum() {
		return dnum;
	}
	public void setDnum(int dnum) {
		this.dnum = dnum;
	}
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getPyung() {
		return pyung;
	}
	public void setPyung(int pyung) {
		this.pyung = pyung;
	}
	public String getDcontent() {
		return dcontent;
	}
	public void setDcontent(String dcontent) {
		this.dcontent = dcontent;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getPostnum() {
		return postnum;
	}
	public void setPostnum(String postnum) {
		this.postnum = postnum;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getDethome() {
		return dethome;
	}
	public void setDethome(String dethome) {
		this.dethome = dethome;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	
	
	
	
}
