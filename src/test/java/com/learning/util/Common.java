package com.learning.util;

public class Common {
	
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
	 
	 public static int[][] createNDimentionalArray(int n){
		 
		 int[][] arr = new int[n][n];
		 for (int i=0;i<n;i++) {
			 for (int j=0;j<n;j++) {
				 arr[i][j]=1;
			 }
		 }
		 return arr;
	 }


}
