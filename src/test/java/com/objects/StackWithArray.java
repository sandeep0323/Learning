package com.objects;

public class StackWithArray {
	ListNode head;
	public int size = 0;
	public int length = 0;
	int[] arr;
	public  StackWithArray(int size) {
		this.size = size;
		arr = new int[size];
		head = null;
	}
	
	public int length() {
		return length;
	}
	
	public void push(int a) {
		ListNode l1 = new ListNode(a);
		l1.next = head;
		head = l1;
		length++;
	}
	
	public int pop() throws Exception {
		if(head!=null) {
			length--;
			return (int) head.val;
		}
		throw new Exception("Stack is empty");
	}
	
	public int popAt(int index) throws Exception {
		if (index>=length) {
			throw new Exception("Stack is empty");
		}else{
			ListNode curr = head;
			while (index == 0) {
				curr = curr.next;
				index--;
			}
			length--;
			return (int)curr.val;
		}
	}

}
