package com.learning.crackingcodinginterview;

import java.util.ArrayList;
import java.util.LinkedList;

import com.objects.TreeNode;
//4.9
public class BSTSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<LinkedList<Integer>> allSequences(TreeNode a) {
		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
		if (a==null) {
			result.add(new LinkedList<Integer>());
			return result;
		}
		LinkedList<Integer> prefix = new LinkedList<Integer>();
		prefix.add(a.val);
		ArrayList<LinkedList<Integer>> leftC = allSequences(a.left);
		ArrayList<LinkedList<Integer>> rightR = allSequences(a.right);
		for (LinkedList<Integer> first: leftC) {
			for (LinkedList<Integer> second: rightR) {
				ArrayList<LinkedList<Integer>> output = new ArrayList<LinkedList<Integer>>();
				weaveLists(first, second, prefix, output);
				result.addAll(output);
			}
		}
			
		return result;
	}

	public static void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second, LinkedList<Integer> prefix,
			ArrayList<LinkedList<Integer>> results) {
		//If first of second is 0 then add the other to prefix and add to result
		if (first.size() == 0 || second.size()==1) {
			LinkedList<Integer> output = (LinkedList<Integer>) prefix.clone();
			output.addAll(first);
			output.addAll(second);
			results.add(output);
			return;//base case i missed
		}
		//take first element as prefix
		int temp = first.removeFirst();
		prefix.addLast(temp);
		weaveLists(first, second, prefix, results);
		first.addFirst(temp);
		prefix.removeLast();
		//take second element as prefix
		temp = second.removeFirst();
		prefix.addLast(temp);
		weaveLists(first, second, prefix, results);
		second.addFirst(temp);
		prefix.removeLast();
		

	}

}
