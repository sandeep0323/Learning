package com.learning.leetcode.medium;

public class MaxIncreasetoKeepCitySkyline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		maxIncreaseKeepingSkyline(grid);
	}

	 public static int maxIncreaseKeepingSkyline(int[][] grid) {
		 
		 int[] lr = new int[grid.length];
		 int[] tb = new int[grid[0].length];
		 // get lr data
		 for (int i=0;i<grid.length;i++) {
			 int[] temp = grid[i];
			 int max = 0;
			 for (int j=0;j<temp.length;j++) {
				 if (temp[j] > max) {
					 max = temp[j];
				 }
			 }
			 lr[i] = max;
		 }
		 printArray(lr);
		 // get tb
		 for (int i =0;i<grid[0].length;i++) {
			 int max =0;
			 for (int j=0;j<grid.length;j++) {
				 if (grid[j][i]>max) {
					 max = grid[j][i];
				 }
			 }
			 tb[i] = max;
		 }
		 printArray(tb);
		 int inc = 0;
		 // loop over each of them to identify the max increase
		 for (int i=0;i<grid.length;i++) {
			 for (int j=0;j<grid[i].length;j++) {
				 int num = grid[i][j];
				 // get max increase at that value
				 while(lr[i]>num && tb[j]> num) {
					 inc++;
					 num = num + 1;
				 }
				 grid[i][j] = num;
			 }
		 }
		 System.out.println("max num: " + inc);
		 printArray(grid);
		 
		 return 0;
		 
	   }
	
	 public static void printArray(int[][] arr) {
		for (int i =0; i<arr.length;i++) {
			 System.out.println("");
			 printArray(arr[i]);
		 }
		 
	 }
	
	 
	 public static void printArray(int[] arr) {
		 System.out.println("");
		 for (int i =0; i<arr.length;i++) {
			 System.out.print(" "+ arr[i] + " ");
		 }
		 
	 }
	 //
	 
	

	 
}

