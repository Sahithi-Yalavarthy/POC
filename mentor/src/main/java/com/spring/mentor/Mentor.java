package com.spring.mentor;

public class Mentor {
	
	private String name;
	private String addr;
	private String branch;
	private String studentID;
	
	public Mentor(String name, String addr, String branch, String studentID) {
	super();
	this.name = name;
	this.addr = addr;
	this.branch = branch;
	this.studentID = studentID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
}
