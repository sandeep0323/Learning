package com.learning.crackingcodinginterview;

import com.objects.ListNode;

public class PartitionALinkedList {

	/**
	 * Write code to partition a linked list around a value x, such that all nodes
	 * less than x come before all nodes greater than or equal to x
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode partition(ListNode head, int x) {
		ListNode before = null;
		ListNode after = null;
		// loop over and add to above nodes
		while (head != null) {
			if ((int)head.val < x) {
				if (before == null) {
					before = new ListNode(head.val);
				} else {
					before.add((int)head.val);
				}
			} else {
				if (after == null) {
					after = new ListNode(head.val);
				} else {
					after.add((int)head.val);
				}
			}
		}
		// Merge two nodes
		if (before == null && after == null) {
			return null;
		} else if (after == null) {
			return before;
		} else if (before == null) {
			return after;
		} else {
			ListNode temp = before;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = after;
		}

		return before;
	}

	public ListNode goodSolution(ListNode node, int x) {
		ListNode beforeStart = null;
		ListNode afterStart = null;

		/* Partition list */
		while (node != null) {
			ListNode next = node.next;
			if ((int)node.val < x) {
				/* Insert node into start of before list */
				node.next = beforeStart;
				beforeStart = node;
			} else {
				/* Insert node into front of after list */
				node.next = afterStart;
				afterStart = node;
			}
			node = next;
		}

		/*
		 * Merrge if (beforeStart == null) { return afterStart; }
		 * 
		 * /* Find end of before list, and merge the lists
		 */
		ListNode head = beforeStart;
		while (beforeStart.next != null) {
			beforeStart = beforeStart.next;
		}
		beforeStart.next = afterStart;

		return head;

	}

}
