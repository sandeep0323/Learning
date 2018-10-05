package com.learning.leetcode;

/**
 * THis was correct
 * @author z993415
 *
 */
public class MinStack {
	
	class Node {
		public int val;
		public Node next;
		
		public Node(int val2) {
			val = val2;
		}
	}
	Node head = null;
	Node min = null;
	 /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        Node a = new Node(x);
        a.next = head;
        head = a;
        if (min == null) {
        	min = new Node(x);
        }else {
        	if (min.val >= x) {
        		Node b = new Node(x);
        		b.next = min;
        		min = b;
        	}
        }
       
    }
    
    public void pop() {
        int val = head.val;
        head = head.next;
        if (val == min.val) {
        	min = min.next;
        }
       
    }
    
    public int top() {
       return head.val;
    }
    
    public int getMin() {
        return min.val;
    }

}
