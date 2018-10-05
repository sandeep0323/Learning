package com.learning.leetcode;

public class RemoveDuplicatesfromSortedArray {

	/**
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
	 * Questions: 1) what should be the size of the array after removing, Should we
	 * move to end or remove them since the question is not to use any extra mempory
	 * other than O(1)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int[] nums = {};
		int len = removeDuplicates(nums);
		for (int i = 0; i < len; i++) {
		    System.out.println(nums[i]);
		}
	}

	public static int removeDuplicates(int[] nums) {
		int start = 0;
		int end = start + 1;
		
		if (nums.length == 0) {
			return start;
		}
		while (end < nums.length) {
			if (nums[start] != nums[end]) {
				nums[start + 1] = nums[end];
				start = start + 1;
			}
			end++;
		}
		return start + 1;
	}

}
