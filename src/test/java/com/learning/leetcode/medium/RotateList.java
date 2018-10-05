package com.learning.leetcode.medium;

import com.objects.ListNode;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1 = rotateRight(l1, 5);
		l1.print(l1);
	}

	public static ListNode rotateRight(ListNode head, int k) {
		if (k == 0) {
			return head;
		}
		if (head != null && head.next != null) {
			// Find the Length of the linked list
			ListNode curr = head;
			int len = 0;
			while (curr != null) {
				len++;
				curr = curr.next;
			}
			// Move the pointer by k times
			curr = head;
			if (k > len) {
				k = k % len;
			}
			if (k == 0 || k == len) {
				return head;
			}
			while (len - k > 1) {
				curr = curr.next;
				len--;
			}
			// Point the elemnt at Kth as the last element
			ListNode p = curr.next;
			curr.next = null;
			// Navigate to last and point last to head
			ListNode temp = p;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = head;
			return p;
		} else {
			return head;
		}

	}

}
