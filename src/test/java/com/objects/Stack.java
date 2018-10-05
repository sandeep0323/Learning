package com.objects;

public class Stack {
	int length;
	ListNode head;
	public Stack() {
		length = 0;
		head = null;
	}
	void push(Object a) {
		length++;
		ListNode l = new ListNode(a);
		l.next = head;
		head = l;
		
	}
	
	public Object pop() {
		if (head!=null) {
			Object val = head.val;
			head = head.next;
			length--;
			return val;
		}
		return null;
	}
	
	Object peek() {
		if (head!=null) {
			return head.val;
		}
		return null;
	}
	
	int length() {
		return length;
	}

}
