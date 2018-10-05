
package com.learning.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
	/**
	 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution2("237"));

	}
	public static List<String> solution(String str){
		HashMap<Character, ArrayList<Character>> map = new HashMap<Character, ArrayList<Character>>();
		ArrayList<Character> twos = new ArrayList<Character>();
		twos.add('a');
		twos.add('b');
		twos.add('c');
		
		ArrayList<Character> threes = new ArrayList<Character>();
		threes.add('d');
		threes.add('e');
		threes.add('f');
		

		ArrayList<Character> fours = new ArrayList<Character>();
		fours.add('g');
		fours.add('h');
		fours.add('i');
		

		ArrayList<Character> fives = new ArrayList<Character>();
		fives.add('j');
		fives.add('k');
		fives.add('l');
		

		ArrayList<Character> six = new ArrayList<Character>();
		six.add('m');
		six.add('n');
		six.add('o');

		ArrayList<Character> seven = new ArrayList<Character>();
		seven.add('p');
		seven.add('q');
		seven.add('r');
		seven.add('s');
		

		ArrayList<Character> eight = new ArrayList<Character>();
		eight.add('t');
		eight.add('u');
		eight.add('v');
		

		ArrayList<Character> nine = new ArrayList<Character>();
		nine.add('w');
		nine.add('x');
		nine.add('y');
		nine.add('z');
		
		

		map.put('2', twos);
		map.put('3', threes);
		map.put('4', fours);
		map.put('5', fives);
		map.put('6', six);
		map.put('7', seven);
		map.put('8', eight);
		map.put('9', nine);
		ArrayList<String> result = new ArrayList<String>();
		for (char c: str.toCharArray()) {
			if (map.containsKey(c)) {
				ArrayList<Character> chars = map.get(c);
				ArrayList<String> tempResult = new ArrayList<String>();
				for (String temp: result) {
					for (char c1:chars) {
						tempResult.add(temp + c1);
					}
				}
				if (tempResult.isEmpty()) {
					for (char c1:chars) {
						tempResult.add(""+c1);
					}
				}
				result = tempResult; 
			}
		}
		
		return result;
		
	}
	
	
	public static List<String> solution1(String str){
		HashMap<Character, ArrayList<Character>> map = new HashMap<Character, ArrayList<Character>>();
		ArrayList<Character> twos = new ArrayList<Character>();
		twos.add('a');
		twos.add('b');
		twos.add('c');
		
		ArrayList<Character> threes = new ArrayList<Character>();
		threes.add('d');
		threes.add('e');
		threes.add('f');
		map.put('2', twos);
		map.put('3', threes);
		ArrayList<String> result = new ArrayList<String>();
		//get total length
		int totalLen = 1;
		for (char c: str.toCharArray()) {
			totalLen = totalLen * map.get(c).size();
		}
		for (int i = 0 ; i< totalLen;i++) {
			result.add("");
		}
		for (char c: str.toCharArray()) {
			ArrayList<Character> chars = map.get(c);
			int charSize = chars.size();
			int index = 0;
			ArrayList<String> temp_result = new ArrayList<String>();
			for (int i = 1; i<=totalLen; i++ ) {
				//index = (i-1)%charSize;
				temp_result.add(result.get(i-1) + chars.get(index));
				if (i%charSize == 0 ) {
					index++;
				}
			}
			result = temp_result;
		}
		return result;		
	}
	
	static String[] map= {"", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"};

	public static List<String> solution2(String str){
		 int[] num = new int[str.length()];

		    for (int i = 0; i < str.length(); i++){
		        num[i] = str.charAt(i) - '0';
		    }
		printWords(num, str.length());
		return null;
	}
	
	public static void  printWordsUtil(int number[], int curr_digit, char output[], int n)
	{
	    // Base case, if current output word is prepared
	    int i;
	    if (curr_digit == n)
	    {
	        System.out.println(output);
	        return ;
	    }
	 
	    // Try all 3 possible characters for current digir in number[]
	    // and recur for remaining digits
	    for (i=0; i<map[number[curr_digit]].length(); i++)
	    {
	        output[curr_digit] = map[number[curr_digit]].charAt(i);
	        printWordsUtil(number, curr_digit+1, output, n);
	        if (number[curr_digit] == 0 || number[curr_digit] == 1)
	            return;
	    }
	}
	 
	// A wrapper over printWordsUtil().  It creates an output array and
	// calls printWordsUtil()
	public static void printWords(int number[], int n)
	{
	    char[] result = new char[n];
	    printWordsUtil(number, 0, result, n);
	}
}
