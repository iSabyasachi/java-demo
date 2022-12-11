package com.java.test;

public class Student {
	public String name;
	public int rollNum;
	public int checkedIn;
	public Student() {
		
	}
	public Student(String name, int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ", checkedIn=" + checkedIn + "]";
	}
	
	
	
}
