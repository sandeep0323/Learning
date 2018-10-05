package com.learning.crackingcodinginterview;

import java.util.ArrayList;

import com.objects.TreeNode;

//4.10
public class CheckSubTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean checkSubTree(TreeNode t1, TreeNode t2) {
		// base condition missed
		if (t2 == null) {
			return true;
		}
		ArrayList<TreeNode> identicalNodes = new ArrayList<TreeNode>();
		// Check if there is reallyIdnetical Node
		for (TreeNode l1 : identicalNodes) {
			if (checkIdenticalNodes(l1, t2))
				return true;
		}
		return false;
	}

	public static boolean checkIdenticalNodes(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return true;
		if (t1 == null || t2 == null)
			return false;
		if (t1.val != t2.val)
			return false;
		return (checkIdenticalNodes(t1.left, t2.left) && checkIdenticalNodes(t1.right, t2.right));

	}

	public void doDfs(TreeNode t1, TreeNode t2, ArrayList<TreeNode> identicalNodes) {
		if (t2 == null || t1 == null) {
			return;
		}
		if (t1.val == t2.val) {
			identicalNodes.add(t1);
			// Insert of adding the identicalNodes to list, you can validate here itself if
			// they are identical and change return accordinlgy
		}
		doDfs(t1.left, t2, identicalNodes);
		doDfs(t1.right, t2, identicalNodes);
	}

}
