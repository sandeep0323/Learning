package com.learning.leetcode.medium;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {-1, 0, 1, 2, -1, -4};
		///Hashing also cann be used to improve , that is also with o(n^2)
		int[] arr = {0,0,0,0};
		System.out.println(solution(arr));

	}

	public static List<List<Integer>> solution(int[] arr) {
			Set<List<Integer>> output = new HashSet<List<Integer>>();
			Arrays.sort(arr);
			int n = arr.length;
			for (int i=0 ; i < n-2; i++) {
				int left = i + 1;
				int right = n - 1;
				while (right > left) {
					int sum = arr[i] + arr[left] + arr[right];
					if (sum > 0 ) {
						right--;
					}else if (sum<0) {
						left ++;
					}else{
						List<Integer> triplet = new ArrayList<Integer>();
						triplet.add(arr[i]);
						triplet.add(arr[left]);
						triplet.add(arr[right]);
						output.add(triplet);
						right--;
						left++;
					}
				}
					
			}
			List<List<Integer>> output1 = new ArrayList<List<Integer>>(); 
			output1.addAll(output);
			return output1;
		
	}
}
