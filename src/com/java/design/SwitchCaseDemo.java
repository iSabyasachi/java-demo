package com.java.design;

enum DAYS{
	MONDAY, TUESDAY,WEDNESDAY
}

public class SwitchCaseDemo {
	public static void main(String[] args) {
		DAYS days = DAYS.MONDAY;
		System.out.println(days);		
		
		switch(days) {
		default :
			System.out.println("Some Days");
			break;
		case MONDAY : 
			System.out.println("Monday");
			break;
		case TUESDAY : 
			System.out.println("Tusday");
			break;
		
		case WEDNESDAY : 
			System.out.println("Wednesday");
			break;		
		}
	}
}
