package com.learning.leetcode;

import com.objects.ListNode;

public class ReverseLinkedList {
/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1 = reverseList(l1);
		l1.print(l1);
		l1 = reverseListUtilIterative(l1);
		l1.print(l1);

	}

	public static ListNode reverseList(ListNode head) {
		return reverseListUtil(head, null);
	}

	public static ListNode reverseListUtil(ListNode head, ListNode prev) {
		if (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = next;
			if (prev != null) {
				return reverseListUtil(next, head);
			}
		}
		return head;
	}
	
	public static ListNode reverseListUtilIterative(ListNode head) {
		ListNode prev = null;
		while (head!=null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}

}
