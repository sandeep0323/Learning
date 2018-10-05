package com.learning.leetcode.medium;

import java.util.HashMap;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		System.out.println(longestPalindrome1("a"));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
	static HashMap<String , Boolean> map ;
	static String palindrome  = "";
	
	public static String longestPalindrome1(String str) {
		if (str.length()<=1) {
			return str;
		}
		int n = str.length();
		int start = 0;
		int maxLength = 1;
		int low, high;
		for (int i = 1 ; i <n;i++) {
			//Find the longest even length palindrome
			low = i -1;
			high = i;
			while (low>=0 && high<n && str.charAt(low) == str.charAt(high)) {
				if (high-low+1>=maxLength) {
					start = low;
					maxLength = high-low+1;
				}
				low--;
				high++;
			}
			//Find the longest odd length palindrome
			low = i - 1;
			high = i + 1;
			while (low>=0 && high<n && str.charAt(low) == str.charAt(high)) {
				if (high-low+1>=maxLength) {
					start = low;
					maxLength = high-low+1;
				}
				low--;
				high++;
			}
		}
		return str.substring(start, start+maxLength);
		
	}
	
	public static String longestPalindrome(String str) {
		map = new HashMap<String, Boolean>();
		palindrome  = "";
		for (int i = 0; i<str.length();i++) {
			for (int j = i ; j<str.length();j++) {
				isPalindrome(str.substring(i, j+1));
			}
		}
		return palindrome;
	}
	
	public static boolean isPalindrome(String str) {
		boolean result = false;
		
		if (str.length()<=1) {
			result = true;
		}else {
			if(map.containsKey(str)) {
				return map.get(str);
			}
			if (str.charAt(0) == str.charAt(str.length()-1) && isPalindrome(str.substring(1, str.length()-1))) {
				result = true;
			}
		}
		if (result && str.length()>=palindrome.length()) {
			palindrome = str;
		}
		return result;
	}

}
