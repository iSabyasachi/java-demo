package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoStream {
	
	public static void main(String[] args) {
		//Intermediate Operations
		//1. map
		List<Integer> number = Arrays.asList(2,3,4,5,6);
		List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(square);
		
		//2. filter
		List<String> names = Arrays.asList("Sabya","Pragyan","Aariketh");
		List<String> filteredName = names
				.stream()
				.filter(n -> n.startsWith("S"))
				.collect(Collectors.toList());
		System.out.println(filteredName);
		
		//3. sort
		List<String> values = Arrays.asList("Reflection","Collection","Stream");
		List<String> result = values.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		
		//Terminal Operation
		//1. collect
		List<Integer> numbers = Arrays.asList(2,3,4,5,3);
		Set<Integer> numSet = numbers.stream().filter(x -> x%2 == 0).collect(Collectors.toSet());
		System.out.println(numSet);
		
		//2. forEach
		List<Integer> nums = Arrays.asList(2,3,4,5,3);
		nums.stream().map(d -> d*d).forEach(d -> System.out.print(d));
		
		//3. reduce
		List<Integer> numbs = Arrays.asList(2,3,4,5);
		int even = numbs.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println("Even"+even);
		
		
	}

}
