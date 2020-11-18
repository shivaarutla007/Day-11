package com.src;

public class Student {
	
	int sid;
	String sname;
	String sadd;
	public Student(int sid, String sname, String sadd) {
		
		this.sid = sid;
		this.sname = sname;
		this.sadd = sadd;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + "]";
	}
	
	
	

}
