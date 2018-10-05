package com.learning.crackingcodinginterview;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> a = new Stack<Integer>();
		a.push(6);
		a.push(1);
		a.push(5);
		a.push(8);
		a.push(2);
		a.push(4);
		a.push(3);
		a.push(9);
		System.out.println(a);
		sortStack1(a);
		System.out.println(a);

	}

	public static void sortStack(Stack<Integer> a) {
		Stack<Integer> b = new Stack<Integer>();
		while (!a.isEmpty()) {
			int val = a.pop();
			if (b.isEmpty()) {
				b.push(val);
			} else if (b.peek() <= val) {
				b.push(val);
			} else {
				// push back to a until you reach min vale
				while (!b.isEmpty() && b.peek() > val) {
					a.push(b.pop());
				}
				b.push(val);
			}
		}
		// push back to original list
		while (!b.isEmpty()) {
			a.push(b.pop());
		}
	}

	// More structures
	public static void sortStack1(Stack<Integer> a) {
		Stack<Integer> b = new Stack<Integer>();
		while (!a.isEmpty()) {
			int val = a.pop();
			while (!b.isEmpty() && b.peek() > val) {
				a.push(b.pop());
			}
			b.push(val);

		}
		// push back to original list
		while (!b.isEmpty()) {
			a.push(b.pop());
		}
	}

}
