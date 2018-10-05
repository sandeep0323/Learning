package com.objects;

public class ListNodeWith2Vals {

	public Object val;
	public Object valP;
	public ListNodeWith2Vals next;
	
	public ListNodeWith2Vals(Object val1, Object val2) {
		val = val1;
		valP = val2;
	}
	
	public void add(Object x, Object y) {
		ListNodeWith2Vals newNode = new ListNodeWith2Vals(x, y);
		ListNodeWith2Vals temp = this;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void print(ListNodeWith2Vals head) {
		while(head!=null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.println("");
	}

}
