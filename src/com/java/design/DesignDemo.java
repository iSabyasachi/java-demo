package com.java.design;

public class DesignDemo{
	int x;
	
	public static void main(String[] args) {
		DesignDemo obj = new DesignDemo();
		
		String dog = AnimalEnum.Dog.makeNoise();
		System.out.println(dog);
		
	}
	
	
}
