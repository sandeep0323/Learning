package com.learning.leetcode;

public class NextPermutation {
	
	/*
	 * not write questions are asked
	 * Good: came up with one good case where inital scritp was failing 1,2,9,7
	 * Bad: NOt came up with good examples.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2 };
		nextPermutation(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}
	 public static void nextPermutation(int[] nums) {
	        int i = nums.length - 2;
	        while (i >= 0 && nums[i + 1] <= nums[i]) {
	            i--;
	        }
	        if (i >= 0) {
	            int j = nums.length - 1;
	            while (j >= 0 && nums[j] <= nums[i]) {
	                j--;
	            }
	            swap(nums, i, j);
	        }
	        reverse(nums, i + 1);
	    }

	    private static void reverse(int[] nums, int start) {
	        int i = start, j = nums.length - 1;
	        while (i < j) {
	            swap(nums, i, j);
	            i++;
	            j--;
	        }
	    }

	    private static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }

}
