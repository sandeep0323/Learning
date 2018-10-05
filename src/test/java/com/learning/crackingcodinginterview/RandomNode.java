package com.learning.crackingcodinginterview;

import java.util.Random;

/**
 * 4.11
 * @author z993415
 *
 */
public class RandomNode {
	
	TreeNode root = null;
	public void insertInOrder(int a){
		if (root == null){
			root = new TreeNode(a);
		}else{
			root.insertInOrder(a);
		}
	}
	
	public TreeNode getRandomElement(){
		Random random = new Random();
		int ran = random.nextInt(root.size);
		return root.getIthElement(ran);
	}
	
	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		int size;
		public TreeNode(int a){
			data = a;
			size = 1;
		}
		
		//insert 
		public void insertInOrder(int a){
			if (a<=data){
				if (left == null){
					left = new RandomNode.TreeNode(a);
				}else{
					left.insertInOrder(a);
				}
				
			}else{
				if (right == null){
					right = new RandomNode.TreeNode(a);
				}else{
					right.insertInOrder(a);
				}
			}
			size++;
		}
		
		//getIthElement
		public RandomNode.TreeNode getIthElement(int i){
			int leftSize = left == null? 0 : left.size;
			if (i == size){
				return this;
			}else if (i <= leftSize){
				return left.getIthElement(i);
			}else{
				return right.getIthElement(i - (left.size + 1));
			}
			
		}
		
		public RandomNode.TreeNode find(int a){
			if (data == a){
				return this;
			}else if (data>a){
				return left !=null ? left.find(a) : null;
			}else{
				return right !=null ? right.find(a) : null;
			}
		}
			
		
	}


}
