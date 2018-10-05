package com.learning.leetcode;

public class NonDecreasingArray {
	/*
	 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,2,3};
		System.out.println("output: "+ checkPossibility(arr));
		
		

	}
	
	 public static boolean checkPossibility(int[] nums) {
		 int index = -1;
		 for (int i=0;i<nums.length-1;i++) {
			if(nums[i]>nums[i+1]) {
				if (index!=-1) {
					return false;
				}
				 index = i;
			 }
			 
		 }
		 
		 return (index==-1 || index==0 || index == nums.length-2 || nums[index+1]>=nums[index-1] || nums[index+2]>=nums[index]) ;
		 
		
	        
	   }

}
