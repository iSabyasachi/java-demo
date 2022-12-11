package com.java.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		HelloWorld obj = new HelloWorld();
		
		String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
		//String[] strs = new String[] {"a"};
		System.out.println(obj.groupAnagrams(strs));
	}
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		Map<String, List<String>> anagrams = Stream.of(strs).collect(Collectors.groupingBy(word -> alphabeticOrder(word)));
		System.out.println(anagrams);		
		
		
        for(List<String> values : anagrams.values()){
            result.add(values);
        }
        
		return result;
	}
	public List<List<String>> groupAnagramsOld(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0) return result;
        
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String str : strs){
            String key = alphabeticOrder(str);
            if(anagrams.containsKey(key)){
                List<String> groupValues = anagrams.get(key);
                groupValues.add(str);
                anagrams.put(key, groupValues);            	
            }else{
                List<String> valueList = new ArrayList<>();
                valueList.add(str);
                anagrams.put(key, valueList);
            }
        }
        System.out.println(anagrams);
        for(List<String> values : anagrams.values()){
            result.add(values);
        }
        
        return result;
    }
    private String alphabeticOrder(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
    

}
