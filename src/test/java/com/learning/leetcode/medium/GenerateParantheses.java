package com.learning.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GenerateParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(5);
	}
	
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	
	//Correct soluition
	
//	class Solution {
//	    public List<String> generateParenthesis(int n) {
//	        List<String> ans = new ArrayList();
//	        if (n == 0) {
//	            ans.add("");
//	        } else {
//	            for (int c = 0; c < n; ++c)
//	                for (String left: generateParenthesis(c))
//	                    for (String right: generateParenthesis(n-1-c))
//	                        ans.add("(" + left + ")" + right);
//	        }
//	        return ans;
//	    }
//	}
	
	public static String solution(int num) {
		//Set<ArrayList<Integer>> output = getWaysOfGettingThisNumber(num);
		Set<String> output = getWaysOfGettingThisNumberOfParantheses1(num);
		System.out.println(output);
		return "";
	}
	
	public static Set<ArrayList<Integer>> getWaysOfGettingThisNumber(int num){
		 Set<ArrayList<Integer>> set   = new HashSet<ArrayList<Integer>>();
		if (num > 0) {
			ArrayList<Integer> n = new ArrayList<Integer>();
			n.add(num);
			set.add(n);
			// 1 + n 
			Set<ArrayList<Integer>> set1 = getWaysOfGettingThisNumber(num-1);
			for (ArrayList<Integer> a: set1) {
				ArrayList<Integer> b = new ArrayList<Integer>();
				b.add(1);
				b.addAll(a);
				a.add(1);
				set.add(a);
				set.add(b);
			}
			
		}
		return set;
	}
	
	public static Set<String> getWaysOfGettingThisNumberOfParantheses(int num){
		 Set<String> set   = new HashSet<String>();
		if (num > 0) {
			String a = "";
			for (int i=num; i>0; i--) {
				a = "("+a+")";
			}
			set.add(a);
			// 1 + n 
			Set<String> set1 = getWaysOfGettingThisNumberOfParantheses(num-1);
			for (String temp: set1) {
				set.add("()"+temp);
				set.add(temp+"()");
				set.add("("+temp+")");
			}
			
		}
		return set;
	}
	static HashMap<Integer,Set<String>> map = new HashMap<Integer,Set<String>>();
	public static Set<String> getWaysOfGettingThisNumberOfParantheses1(int num){
		 Set<String> set   = new HashSet<String>();
		if (num == 1) {
			set.add("()");
			return set;
		}
		if (map.containsKey(num)) {
			return map.get(num);
		}
		Set<String> set1 = getWaysOfGettingThisNumberOfParantheses1(num-1);
		for (String temp: set1) {
			set.add("()"+temp);
			set.add(temp+"()");
			set.add("("+temp+")");
		}
		
		for (int i = 2; i <= num / 2; i++) {
			Set<String> set2 = getWaysOfGettingThisNumberOfParantheses1(num - i);
			Set<String> set3 = getWaysOfGettingThisNumberOfParantheses1(i);
			for (String a : set2) {
				for (String b : set3) {
					set.add(a + b);
					set.add(b + a);
				}
			}
		}
		map.put(num, set);
		return set;
	}


}
