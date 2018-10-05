package com.learning.leetcode;

public class DetectCapital {

	/*
	 * Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Outpt: " + usageOfWord("USA"));
		System.out.println("Outpt: " + usageOfWord("Google"));
		System.out.println("Outpt: " + usageOfWord("FlaG"));
		System.out.println("Outpt: " + usageOfWord("F"));
		System.out.println("Outpt: " + usageOfWord("f"));
		System.out.println("Outpt: " + usageOfWord("flaG"));
		System.out.println("Outpt: " + usageOfWord("FFFFFFf"));

	}
	
	public static boolean usageOfWord(String st) {
		int result = isChar(st.charAt(0))? 1 : 0;
		for (int i=1;i<st.length(); i++) {
			int temp = isChar(st.charAt(i))? 1: 0;
			if(temp>result || (i>1 && temp<result)) {
				return false;
			}
			result = temp;
		}
		
		return true;
	}
	
	public static boolean isChar(char c) {
		if('A'<=c && c<='Z') {
			return true;
		}
		return false;
	}

}
