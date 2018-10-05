package com.objects;

public class Queue {
	
	int length;
	ListNode head, tail;
	
	public Queue() {
		length = 0;
		head = null;
		tail = null;
	}
	
	void enqueue(Object a) {
		ListNode l = new ListNode(a);
		if (head!=null) {
			tail.next = l;
			tail = l;
		}else {
			head = l;
			tail = l;
		}
	}
	
	Object dequeue() {
		if (head!=null) {
			Object val = head.val;
			head = head.next;
			if (head == null) {
				tail = null;
			}
			return val;
		}
		return null;
	}
	
	int length() {
		return length;
	}
	
	Object peek() {
		return head.val;
	}

}
