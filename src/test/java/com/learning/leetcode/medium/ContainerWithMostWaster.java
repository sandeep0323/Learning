package com.learning.leetcode.medium;

public class ContainerWithMostWaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,8,6,2,5,4,8,3,7};
		long startTime = System.nanoTime();
		System.out.println(solution2(arr));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
	}
	
	public static int solution1(int[] arr) {
		int max = 0;
		int l = arr.length;
		for (int i = 0 ; i<l; i++) {
			for (int j = l -1 ; j>i ; j--) {
				max = Math.max(max, Math.min(arr[i], arr[j]) * (j - i));
				if (arr[j]>= arr[i]) {
					break;
				}
			}
		}
		return max;
	}
	
	public static int solution2(int[] height) {
		  int maxarea = 0, l = 0, r = height.length - 1;
	        while (l < r) {
	            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
	            if (height[l] < height[r])
	                l++;
	            else
	                r--;
	        }
	        return maxarea;
	}

}
