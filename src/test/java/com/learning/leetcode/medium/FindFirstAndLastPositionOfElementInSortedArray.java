package com.learning.leetcode.medium;

import java.util.Arrays;

import com.learning.util.Common;

public class FindFirstAndLastPositionOfElementInSortedArray {

	/**
	 * Questions: What if there is only one element or no element, then return [-1, -1]
	 * Try to get in O(longN)
	 * Question:What should be the worst case , worst case is logN?
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-99999,-99998,-9999,-999,-99,-9,-1};
		Common.printArray(findFirstAndLastPosition(nums, 0));

	}
	
	/**
	 * You are breaking to find at lease one element, instead of that find low and high using binary search, just by including which one to be coonsidered
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] findFirstAndLastPosition(int[] nums, int target) {
		int[] result = {-1, -1};
		if (nums.length == 0) {
			return result;
		}
		
		int position = findAnyPositionAnIntegerReturned(nums, target, 0 , nums.length - 1);
		if (position!=-1) {
			//find min 
			for (int i=position; i>=0;i--) {
				if (nums[i]!=target) {
					break;
				}
				result[0] = i;
			}
			//find max
			for (int i=position; i<nums.length;i ++) {
				if (nums[i]!=target) {
					break;
				}
				result[1] = i;
			}
			
		}
		return result;
	}
	
	public static int findAnyPositionAnIntegerReturned(int[] nums, int target, int start, int end) {
		int middle = -1;
		if (start == end) {
			if (nums[start] == target) {
				return start;
			}
			return middle;
		}
		while (end > start) {
			middle = (end - start + 1)/2 + start;
			if (nums[middle] > target) {
				return findAnyPositionAnIntegerReturned(nums, target, start, middle - 1);
			}else if (nums[middle] < target) {
				return findAnyPositionAnIntegerReturned(nums, target, middle + 1, end);
			}else {
				break;
			}
		}
		
		return middle;
	}
	
	//This is O(N), looking for O.logN
	public static int[] findFirstAndLastPositionOld(int[] nums, int target){
		int len = nums.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i<len;i ++){
			if (nums[i]==target){
				if (i>max){
					max = i;
				}
				if (i<min){
					min= i;
				}
			}
		}
		int[] result = {min, max};
		return result;
	}

}
