package com.learning.crackingcodinginterview;

import com.objects.TreeNode;

public class CheckBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int checkBalanced(TreeNode root) {
		if (root !=null) {
			int lefth = checkBalanced(root.left);
			int righth = checkBalanced(root.right);
			if (Math.abs(lefth - righth) > 1) return Integer.MIN_VALUE;
			return Math.max(lefth, righth) + 1;
		}
		return 0;
	}

}
