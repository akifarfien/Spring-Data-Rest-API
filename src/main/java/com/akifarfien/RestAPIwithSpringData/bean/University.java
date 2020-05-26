package com.akifarfien.RestAPIwithSpringData.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {
	
	@Id
	@GeneratedValue
	private int uid;
	private String UniName;
	private long regNo;
	
	
	public University(int uid, String uniName, long regNo) {
		super();
		this.uid = uid;
		UniName = uniName;
		this.regNo = regNo;
	}
	
	public University() {
		
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUniName() {
		return UniName;
	}
	public void setUniName(String uniName) {
		UniName = uniName;
	}
	public long getRegNo() {
		return regNo;
	}
	public void setRegNo(long regNo) {
		this.regNo = regNo;
	}
	
	

}
