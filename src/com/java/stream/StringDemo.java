package com.java.stream;

import java.util.stream.Stream;

public class StringDemo {
	public static void main(String[] args) {
		//anyMatch : boolean anyMatch(Predicate<? super T> predicate)
		System.out.println(anyMatch());
	}
	/*
	 * Check if Character at 1st index is UpperCase in any string or not using
	 * Stream anyMatch(Predicate predicate)
	 * */
	public static boolean anyMatch(){
		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("Test","hello","World");
		boolean res = stream.anyMatch(str -> Character.isUpperCase(str.charAt(0)));
		return res;
	}
}


