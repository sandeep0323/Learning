package com.learning.crackingcodinginterview;

import java.util.Stack;

public class QueueWithStack {
	
	Stack<Integer> pusher = new Stack<Integer>();
	Stack<Integer> poper = new Stack<Integer>();
	
	public void push(int a) {
		pusher.add(a);
	}
	
	public int pop() {
		if (poper.size() == 0) {
			while (pusher.size()!=0) {
				poper.push(pusher.pop());
			}
		}
		return poper.pop();
	}

}
