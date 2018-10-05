package com.learning.crackingcodinginterview;

import java.util.ArrayList;

import com.objects.StackWithArray;

public class SetOfStacks {
	int size ;
	ArrayList<StackWithArray> arr = new ArrayList<StackWithArray>();
	int index = 0;
	public SetOfStacks(int size) {
		this.size = size;
		StackWithArray l1 = new StackWithArray(size);
		arr.add(l1);
	}
	
	public void push(int a) {
		StackWithArray l1 = arr.get(index);
		if (index<0 || l1.length == size) {
			l1 = new StackWithArray(size);
			l1.push(a);
			arr.add(l1);
			index++;
		}else {
			l1.push(a);
		}
	}
	
	public void pop() throws Exception {
		if (index<0) {
			throw new Exception("Stack is empty");
		}
		StackWithArray l1 = arr.get(index);
		if (l1.length == 0) {
			throw new Exception("Stack is empty");
		}else {
			
			l1.pop();
			if(l1.length==0) {
				index--;
			}
		}
	}
	
	
	public void popAt(int ind) throws Exception {
		//Find which stack it falls;
		int whichIndex = ind / size + 1;
		if (whichIndex > index) {
			throw new Exception("Invalid Index");
		}
		StackWithArray l1 = arr.get(whichIndex);
		l1.popAt(ind - whichIndex * size);
		//now move the elements from other to this 
		int l = arr.size();
		for (int i = whichIndex;i<l-1;i++) {
			int val = arr.get(i+1).pop();
			arr.get(i).push(val);
		}
	}

}
