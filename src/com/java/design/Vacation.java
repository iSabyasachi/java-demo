package com.java.design;

enum DaysOff{
	ThanksGiving,PresidentsDay,ValentinesDay
}
public class Vacation {
	public static void main(String[] args) {
		final DaysOff input = DaysOff.ThanksGiving;
		switch(input) {
			default:
			case ValentinesDay:
				System.out.println("1");
			case PresidentsDay:
				System.out.println("2");
		}
	}
}
