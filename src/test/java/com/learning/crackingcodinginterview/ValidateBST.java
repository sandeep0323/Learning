package com.learning.crackingcodinginterview;

import com.objects.TreeNode;

//4.5
public class ValidateBST {
	
	static class custom{
		public boolean bst;
		public int min;
		public int max;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(10);
		
	}
	
	public boolean validateBst(TreeNode node, Integer min, Integer max) {
		if (node == null) {
			return true;
		}
		if ((min!=null && node.val<=min) || (max!=null && node.val>max)) return false;
		if (!validateBst(node.left, min, node.val) && !validateBst(node.right, node.val, max)) return false;
		return true;
		
	}
//	public static Boolean validateBST(TreeNode root) {
//		return validateBstUil(root).bst;
//	}
//	
//	public static custom validateBstUil(TreeNode root) {
//		ValidateBST.custom a  = new ValidateBST.custom();
//		if (root==null) {
//			a.bst = true;
//			a.min = Integer.MAX_VALUE;
//			a.max = Integer.MIN_VALUE;
//		}
//
//		if (root.left!=null && root.left.val>root.val) a.bst = false;
//		if (root.right!=null && root.right.val<=root.val) a.bst = false;
//		int leftmax = validateBstUil(root.left).max;
//		int rightmin = validateBstUil(root.right).max;
//		if (root.left!=null && leftmax>root.val) a.bst = false;
//		if (root.right!=null && rightmin<=root.val) a.bst = false;
//		a.min = Math.min(root.val, rightmin);
//		a.max = Math.max(root.val, leftmax);
//		
//		return a;
//		
//	}

}
