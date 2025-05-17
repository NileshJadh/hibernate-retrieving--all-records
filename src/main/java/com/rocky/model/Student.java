package com.rocky.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentstable")
public class Student {

	@Id
	private Integer sid;
	
	private String scity;
	
	private String sname;
	
	public Student() {
		
		System.out.println("Zero Param Consructor");
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", scity=" + scity + ", sname=" + sname + "]";
	}
	
	
}
