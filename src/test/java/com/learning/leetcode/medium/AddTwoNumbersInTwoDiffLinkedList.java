package com.learning.leetcode.medium;

public class AddTwoNumbersInTwoDiffLinkedList {

	public class ListNode {
		int val;
		ListNode next;

		public ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ListNode l1 = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(2);
//		l1.next = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(4);
//		l1.next.next = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(3);
//		
//		ListNode l2 = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(7);
//		l2.next = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(5);
//		l2.next.next = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(6);
//		l2.next.next.next = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(4);
		
		ListNode l1 = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(1);
		l1.next = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(8);
		
		ListNode l2 = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(0);
		
		
		printListNode(addTwoNumbers(l1, l2));
		
	}
	
	public static void printListNode(ListNode l1) {
		while (l1!=null) {
			System.out.print(l1.val + " -> ");
			l1 = l1.next;
		}
		System.out.println();
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode l3 = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(0);
		ListNode l3t = l3;
		while (l1!=null && l2!=null) {
			int sum = carry + l1.val + l2.val;
			int val = sum%10;
			carry = sum/10;
			l3t.next = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(val);
			l1 = l1.next;
			l2 = l2.next;
			l3t = l3t.next;
		}
		
		while (l1!=null) {
			int sum = carry + l1.val;
			int val = sum%10;
			carry = sum/10;
			l3t.next = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(val);
			l1 = l1.next;
			l3t = l3t.next;
		}
		
		while (l2!=null) {
			int sum = carry + l2.val;
			int val = sum%10;
			carry = sum/10;
			l3t.next = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(val);
			l2 = l2.next;
			l3t = l3t.next;
		}
		
		if (carry>=1) {
			l3t.next = new AddTwoNumbersInTwoDiffLinkedList().new ListNode(carry);
		}
		return l3.next;
	}

}
