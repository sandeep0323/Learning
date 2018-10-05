package com.learning.leetcode;

import java.util.Stack;

public class BackSpaceStringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Examples
		 * Input: S = "ab##", T = "c#d#"
		 * Input: S = "a##c", T = "#a#c"
		 * Input: S = "a#c", T = "b"
		 */
			System.out.println(backspaceCompare("ab##", "c#d#"));
			System.out.println(backspaceCompare("a##c", "#a#c"));
			System.out.println(backspaceCompare("a#c", "b"));
			System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
	}
	
	 public static boolean backspaceCompare(String S, String T) {
	       Stack s1 = StringToStack(S);
	       Stack s2 = StringToStack(T);
	       if (s1.size()!=s2.size()) return false;
	       while (!s1.isEmpty()) {
	    	   if (s1.pop() != s2.pop()) return false;
	       }
	       return true;
	   }
	 
	 public static Stack StringToStack(String str) {
		 Stack s1 = new Stack();
		 for(char a: str.toCharArray()) {
	    	   if (a == '#' && !s1.isEmpty()) {
	    		   s1.pop();
	    	   }else if (a != '#') {
	    		   s1.push(a);
	    	   }
	       }
		 return s1;
	 }

}
