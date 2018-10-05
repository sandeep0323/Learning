package com.learning.hackersrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = lengthOfLongestSubstring("baabcabcc");
		System.out.println(a);
		 
	}
	
	 public static int lengthOfLongestSubstring(String s) {
	        int n = s.length();
	        Set<Character> set = new HashSet<>();
	        int ans = 0, i = 0, j = 0;
	        while (i < n && j < n) {
	            // try to extend the range [i, j]
	            if (!set.contains(s.charAt(j))){
	                set.add(s.charAt(j++));
	                ans = Math.max(ans, j - i);
	            }
	            else {
	                set.remove(s.charAt(i++));
	            }
	        }
	        return ans;
	    }
	
	 static String kangaroo(int x1, int v1, int x2, int v2) {
		 
		 
	        // Complete this function
		 return "NO";
	    }
	
	 static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
	        int apoints = 0;
	        int bpoints = 0;
	        for (int d : apples){
	            if (s<=a+d && a+d<=t){
	                apoints = apoints + 1;
	            }
	        }
	        for (int d : oranges){
	            if (s<=b+d && b+d<=t){
	                bpoints = bpoints + 1;
	            }
	        }
	        System.out.println(apoints + " " + bpoints);

	    }

}
