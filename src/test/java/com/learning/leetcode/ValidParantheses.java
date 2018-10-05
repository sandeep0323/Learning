package com.learning.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(isValid("(("));
	}
	
	
	public boolean isValidCorrect(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
	
    public static boolean isValid(String s) {
    	HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        Stack<Character> st = new Stack<Character>();
        for (char a : s.toCharArray()){
            if (map.containsKey(a)){
                st.push(a);
            }else{
            	if (st.size()==0) return false;
                if(map.get(st.pop())!= a) return false;
            }         
        }
        if (st.size()!=0) return false;
        return true;
    }

}
