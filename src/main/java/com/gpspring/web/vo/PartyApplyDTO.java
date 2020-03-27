package com.gpspring.web.vo;

public class PartyApplyDTO { //�뙆�떚 �떊泥��븯�뒗 DTO
	int psnum;
	int pnum;
	String id;
	String date;
	int count_apply;  // �떊泥��븳 紐낆닔 戮묒븘�삤�뒗 DTO
	
	
	
	
	public int getCount_apply() {
		return count_apply;
	}
	public void setCount_apply(int count_apply) {
		this.count_apply = count_apply;
	}
	public int getPsnum() {
		return psnum;
	}
	public void setPsnum(int psnum) {
		this.psnum = psnum;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
