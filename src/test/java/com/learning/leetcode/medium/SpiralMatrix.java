package com.learning.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		// int[][] matrix = { { 1, 2, 3}, { 4,5,6}, { 7,8,9 } };
		// int[][] matrix = { { 1}, { 2}, { 3 } };
		// int[][] matrix = { { 1,2,3} };
		// int[][] matrix = {};
		System.out.println(spiralOrder(matrix));
	}

	public static List<Integer> arr = new ArrayList<Integer>();

	public static List<Integer> spiralOrder(int[][] matrix) {
		if (matrix.length > 0) {
			int xlength = matrix[0].length;
			util(matrix, 0, matrix.length - 1, 0, xlength - 1);
		}
		return arr;
	}

	public static void util(int[][] matrix, int xstart, int xend, int ystart, int yend) {
		// Print top ones, y towards its end
		if (xend > xstart && yend > ystart) {
			for (int i = ystart; i <= yend; i++) {
				arr.add(matrix[xstart][i]);
			}
			// for right most ones
			for (int i = xstart + 1; i <= xend; i++) {
				arr.add(matrix[i][yend]);
			}
			// for bottom most
			for (int i = yend - 1; i >= ystart; i--) {
				arr.add(matrix[xend][i]);
			}
			// for left most
			for (int i = xend - 1; i > xstart; i--) {
				arr.add(matrix[i][ystart]);
			}
			util(matrix, xstart + 1, xend - 1, ystart + 1, yend - 1);
		} else if (yend > ystart) {
			for (int i = ystart; i <= yend; i++) {
				arr.add(matrix[xstart][i]);
			}
		} else if (xend > xstart) {
			for (int i = xstart; i <= xend; i++) {
				arr.add(matrix[i][yend]);
			}
		} else if (xstart == xend && ystart == yend) {
			arr.add(matrix[xstart][ystart]);
		}
	}

}
