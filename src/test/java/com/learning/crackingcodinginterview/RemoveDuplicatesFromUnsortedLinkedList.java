package com.learning.crackingcodinginterview;

import java.util.HashMap;

import com.objects.ListNode;

public class RemoveDuplicatesFromUnsortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void deleteDuplicates(ListNode node) {
		if (node == null) {
			return;
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ListNode prev = null;
		while (node != null) {
			if (map.containsKey(node.val)) {
				prev.next = node.next;
			} else {
				map.put((int)node.val, 1);
				prev = node;
			}
			node = node.next;
		}

	}

	/**
	 * NO buffer
	 * 
	 * @param node
	 */
	public static void deleteDuplicatesV2(ListNode node) {
		while (node!=null) {
			ListNode temp = node;
			while (temp.next!=null) {
				if (node.val == temp.next.val) {
					temp.next = temp.next.next;
				}else {
					temp = temp.next;
				}
			}
			node = node.next;
		}
		
	}

}
