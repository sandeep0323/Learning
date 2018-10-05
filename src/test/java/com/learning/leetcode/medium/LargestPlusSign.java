package com.learning.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.learning.util.Common;
import com.objects.Point;

public class LargestPlusSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] minus = { { 4, 2 } };
		orderOfLargestPlusSign(5, minus);
	}

	public static int orderOfLargestPlusSign(int N, int[][] mines) {
		   Set<Integer> banned = new HashSet();
	        int[][] dp = new int[N][N];
	        
	        for (int[] mine: mines)
	            banned.add(mine[0] * N + mine[1]);
	        int ans = 0, count;
	        
	        for (int r = 0; r < N; ++r) {
	            count = 0;
	            for (int c = 0; c < N; ++c) {
	                count = banned.contains(r*N + c) ? 0 : count + 1;
	                dp[r][c] = count;
	            }
	            
	            count = 0;
	            for (int c = N-1; c >= 0; --c) {
	                count = banned.contains(r*N + c) ? 0 : count + 1;
	                dp[r][c] = Math.min(dp[r][c], count);
	            }
	        }
	        System.out.println("---------------------");
	        Common.printArray(dp);
	        for (int c = 0; c < N; ++c) {
	            count = 0;
	            for (int r = 0; r < N; ++r) {
	                count = banned.contains(r*N + c) ? 0 : count + 1;
	                dp[r][c] = Math.min(dp[r][c], count);
	            }
	            
	            count = 0;
	            for (int r = N-1; r >= 0; --r) {
	                count = banned.contains(r*N + c) ? 0 : count + 1;
	                dp[r][c] = Math.min(dp[r][c], count);
	                ans = Math.max(ans, dp[r][c]);
	            }
	        }
	        
	        return ans;
	}

	public static int getMaxPlusAtThisPoint(int[][] arr, Point p) {
		int tmax = 0;
		// Check for plus sign
		int x = p.x;
		int y = p.y;
		int index = 0;
		while (x - index >= 0 && y - index >= 0 && x + index < arr.length && y + index < arr.length
				&& arr[x - index][y] == 1 && arr[x][y - index] == 1 && arr[x + index][y] == 1
				&& arr[x][y + index] == 1) {
			tmax++;
			index++;
		}
		return tmax;
	}

}
