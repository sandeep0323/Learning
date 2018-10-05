package com.objects;

public class ListNode {

	public Object val;
	public ListNode next;
	
	public ListNode(Object val2) {
		val = val2;
	}
	
	public void add(Object x) {
		ListNode newNode = new ListNode(x);
		ListNode temp = this;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void print(ListNode head) {
		while(head!=null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.println("");
	}

}
