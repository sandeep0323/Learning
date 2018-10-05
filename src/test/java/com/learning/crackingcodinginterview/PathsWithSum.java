package com.learning.crackingcodinginterview;

import java.util.HashMap;

import com.objects.TreeNode;

//4.12
public class PathsWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int countPathsWithSum(TreeNode a, int targetSum) {
		return countPathsWithSum(a, targetSum, 0, new HashMap<Integer, Integer>());
	}

	int countPathsWithSum(TreeNode root, int targetSum, int runningSum, HashMap<Integer, Integer> map) {
		if (root == null)
			return 0;
		// increase my runnng sum
		runningSum = runningSum + root.val;
		int sum = runningSum - targetSum;
		int totalPaths = map.getOrDefault(sum, 0);
		if (runningSum == targetSum) {
			totalPaths++;
		}
		// insert current running into the list
		incrementHashMap(map, runningSum, 1);
		totalPaths += countPathsWithSum(root.left, targetSum, runningSum, map);
		totalPaths += countPathsWithSum(root.right, targetSum, runningSum, map);
		incrementHashMap(map, runningSum, -1);
		return totalPaths;

	}

	public void incrementHashMap(HashMap<Integer, Integer> map, int key, int delta) {
		int nextSum = map.getOrDefault(key, 0) + delta;
		if (nextSum == 0) { // then remove the key
			map.remove(key);
		} else {
			map.put(key, nextSum);
		}
	}

}
