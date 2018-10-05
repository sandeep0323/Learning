package com.learning.crackingcodinginterview;

import java.util.ArrayList;
import java.util.List;

import com.objects.TreeNode;

public class ListOfDepths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List output = new ArrayList();
		List<TreeNode> list = new ArrayList<TreeNode>();
		TreeNode root = new TreeNode(1);
		list.add(root);
		listOfDepths(list, output);

	}
	
	//Correct in recursive, Can be done iterative also and also customized pre order traversal
	public static List listOfDepths(List<TreeNode> roots, List output) {
		if (roots.size() > 0) {
			output.add(roots);
			List<TreeNode> a = new ArrayList<TreeNode>();	
			for (TreeNode root: roots) {
				if (root.left!=null) {
					a.add(root.left);
				}
				if (root.right!=null) a.add(root.right);
			}
			listOfDepths(a, output);
		}
			return output;
	}

}
