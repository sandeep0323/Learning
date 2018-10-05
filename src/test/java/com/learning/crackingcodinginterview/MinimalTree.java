package com.learning.crackingcodinginterview;

import com.objects.TreeNode;

public class MinimalTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode minimalTree(int[] arr, int start, int end) {
		TreeNode root = null;
		if (end > start) {
			int middle = (end - start + 1)/2 + start;
			root = new TreeNode(arr[middle]);
			root.left = minimalTree(arr, start, middle - 1);
			root.right = minimalTree(arr, middle + 1, end);
		}
		return root;
	}

}
