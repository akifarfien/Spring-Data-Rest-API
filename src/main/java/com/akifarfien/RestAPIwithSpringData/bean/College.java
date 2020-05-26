package com.akifarfien.RestAPIwithSpringData.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class College {


	@Id
	@GeneratedValue
	private int cid;
	private int regNo;
	private String collegeName;

	public College(int cid, int regNo, String collegeName, University university) {
		super();
		this.cid = cid;
		this.regNo = regNo;
		this.collegeName = collegeName;
		this.university = university;
	}
	
public College() {
		
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "uid")
	private University university;


	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

}
