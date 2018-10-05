package com.learning.leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs =  {};
		System.out.println(longestCommonPrefix(strs));

	}
	//This is vertical solution, but need to improve coding skills here
	//same can be written as
	/*public String longestCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0) return "";
	    for (int i = 0; i < strs[0].length() ; i++){
	        char c = strs[0].charAt(i);
	        for (int j = 1; j < strs.length; j ++) {
	            if (i == strs[j].length() || strs[j].charAt(i) != c)
	                return strs[0].substring(0, i);             
	        }
	    }
	    return strs[0];
	}*/
	public static String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i < strs.length;i++){
            min = Math.min(min, strs[i].length());   
        }
        String output = "";
        for (int i=0; i<min;i++){
            boolean breaker = false;
            for (int j=1; j<strs.length;j++){
                if (strs[j-1].toCharArray()[i]!=strs[j].toCharArray()[i]){
                    breaker = true;
                    break;
                }
            }
            if (breaker){
                return output;
            }else{
                output = output + strs[0].toCharArray()[i];
            }
        }
        return output;
    }

}
