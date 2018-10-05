package com.learning.crackingcodinginterview;

public class Implement3StacksWithSingleArray {
	//3.1 Describe how you could use a single array to implement three stacks.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int[] arr;
	int size;
	int[] StackCurrentSize  = {0,0,0};
	public Implement3StacksWithSingleArray(int size) {
		this.size = size;
		arr =new int[size * 3];
		
	}
	
	public int push(int a, int stack) throws Exception {
		if (stack<1 || stack>3) {
			throw new Exception("Invalid Stack");
		}
		int start = (stack - 1) * stack;
		int index = start + StackCurrentSize[stack-1];
		if (index >= stack*size) {
			throw new Exception("0ut of space.");
		}else {
			arr[index] = a;
			StackCurrentSize[stack-1]++;
		}
		return 0;
	}
	
	public int pop(int stack) throws Exception {
		if (StackCurrentSize[stack-1] == 0) {
			throw new Exception("Trying to pop an empty stack.");
		}
		int start = (stack - 1) * stack;
		int index = start + StackCurrentSize[stack-1] - 1;
		
		int val = arr[index];
		StackCurrentSize[stack-1]--;
		return val;
	}
}
