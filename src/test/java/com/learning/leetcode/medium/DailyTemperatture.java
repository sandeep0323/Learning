package com.learning.leetcode.medium;

import java.util.Arrays;
import java.util.Stack;

import com.learning.util.Common;

/**
 * https://leetcode.com/problems/daily-temperatures
 * @author z993415
 *
 */
public class DailyTemperatture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {73, 74, 75, 71, 69, 72, 76, 73};
			Common.printArray(dailyTemperatures(arr));
	}
	
	 public static int[] dailyTemperatures(int[] temperatures) {
	     int[] output = new int[temperatures.length];
	     Stack<Integer> stack = new Stack<Integer>();
	     
	     for (int l = output.length - 1;l>=0;--l) {
	    	 while (!stack.isEmpty() && temperatures[l]>=temperatures[stack.peek()]) {
	    		 stack.pop();
	    	 }
	    	 if (stack.isEmpty()) {
	    		 output[l] = 0;
	    	 }else {
	    		 output[l] = stack.peek() - l;
	    	 }
	    	 stack.push(l);
	     }
	     return output;
	    }

}
