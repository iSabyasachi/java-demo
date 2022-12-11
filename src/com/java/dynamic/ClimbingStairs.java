package com.java.dynamic;

import java.util.ArrayList;
import java.util.Collections;

public class ClimbingStairs {
	public static void main(String[] args){
        ClimbingStairs obj = new ClimbingStairs();
        int n = 5;
        int result = obj.climbStairs(n);        
        System.out.println(result);
    }  
    public int climbStairs(int n) {
       int[] memo = new int[n + 1];
       Collections.shuffle(new ArrayList<>());
       return climbStairs(0, n , memo);
    }
    public int climbStairs(int i, int n, int[] memo) {        
       if(i == n) return 1;
       else if(i > n) return 0;
       else if(memo[i] > 0) return memo[i];
        
       memo[i] = climbStairs(i + 1, n, memo) + climbStairs(i + 2, n , memo); 
       
       return memo[i];
    } 
}
