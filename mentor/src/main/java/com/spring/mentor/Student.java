package com.spring.mentor;

public class Student {

	private String name;
	private String rollno;
	private String branch;
	

	public Student(String name, String rollno, String branch) {
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getAddr() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
