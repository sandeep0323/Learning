package com.learning.leetcode;

import com.objects.ListNode;

public class MergeTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ListNode l1 = new ListNode(1);
			l1.add(3);
			l1.add(5);
			l1.add(7);
			ListNode l2 = new ListNode(2);
			l2.add(4);
			ListNode l3 = recurcive(l1, l2);
			l3.print(l3);
			System.out.println( -4 % -3);
			
	}
	//Improvement:  Need to think of both Iterative and recursive always
	public static ListNode recurcive(ListNode l1, ListNode l2) {
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		if ((int)l1.val < (int)l2.val) {
			l1.next = recurcive(l1.next ,l2);
			return l1;
		}else {
			l2.next = recurcive(l1 ,l2.next);
			return l2;
		}
		
	}
	// This is written by me
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = null;
		ListNode current = null;
		// If data exists in both of them
		while (l1 != null && l2 != null) {
			if ((int)l1.val < (int)l2.val) {
				ListNode temp = new ListNode(l1.val);
				if (current == null) {
					l3 = temp;
					current = l3;
				} else {
					current.next = temp;
					current = temp;
				}
				l1 = l1.next;
			} else {
				ListNode temp = new ListNode(l2.val);
				if (current == null) {
					l3 = temp;
					current = l3;
				} else {
					current.next = temp;
					current = temp;
				}
				l2 = l2.next;
			}

		}
		// If data exists in only one
		while (l1 != null) {
			ListNode temp = new ListNode(l1.val);
			if (current == null) {
				l3 = temp;
				current = l3;
			} else {
				current.next = temp;
				current = temp;
			}

			l1 = l1.next;
		}
		while (l2 != null) {
			ListNode temp = new ListNode(l2.val);
			if (current == null) {
				l3 = temp;
				current = l3;
			} else {
				current.next = temp;
				current = temp;
			}

			l2 = l2.next;
		}

		return l3;
	}

}
