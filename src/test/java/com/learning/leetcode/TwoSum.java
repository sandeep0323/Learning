package com.learning.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	/**
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 2, 4};
		System.out.println(Arrays.toString(twoSum(arr, 6)));
		

	}
	
	
	public static int[] twoSum(int[] nums, int target) {
		int [] result = {0, 0};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i= 0; i< nums.length;i++) {
			map.put(nums[i], i);
		}
		for (int i=0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i])) {
				result[0] = i;
				result[1] = map.get(target-nums[i]);
				return result;
			}
		}
		return result;
	}

}
