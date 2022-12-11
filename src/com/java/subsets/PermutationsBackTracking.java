package com.java.subsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationsBackTracking {
	 /**
    Algorithm :
    for(i = left ; i < right ; i++){
        swap(str, left  , i);
        permute(str, i + 1, right);
        swap(str, left , i);
    }
     */
    
    public static void main(String[] args) {  
        PermutationsBackTracking obj = new PermutationsBackTracking();      
        List<List<Integer>> result = obj.permute(new int[] { 1, 3, 5});
        System.out.print("Here are all the permutations: " + result);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        for(int num : nums){
            input.add(num);
        }
        backTrack(0 , nums.length , input , output);
        return output;
    }

    public void backTrack(int left, int right, List<Integer> input, List<List<Integer>> output){
        if(left == right)
            output.add(new ArrayList<Integer>(input));
        
        for(int i = left ; i < right ; i++){
            Collections.swap(input, left, i);
            backTrack(left + 1 , right , input , output);
            Collections.swap(input, left, i);
        }
    }
}
