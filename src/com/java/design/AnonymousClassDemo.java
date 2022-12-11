package com.java.design;

import java.util.LinkedHashMap;
import java.util.Map;

class Pizza{
	public void eat() {
		System.out.println("pizza");
	}
}

public class AnonymousClassDemo {
	public static void main(String[] args) {
		Pizza pizza = new Pizza() {
			public void eat() {
				System.out.println("eating pizza");
			}
		};
		pizza.eat();
		
		Food food = new Food() {
			@Override
			public void eat() {
				System.out.println("Eating dominos");
			}
		};
		food.eat();
		
		int MAX = 5;
		LinkedHashMap<Integer,Integer> lhMap = new LinkedHashMap<Integer,Integer>() {
			@Override
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldestEntry) {
				return size() > MAX;
			}
		};
	}
}
