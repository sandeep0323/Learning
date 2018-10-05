package com.learning.crackingcodinginterview;

import com.objects.ListNodeWith2Vals;

/**
 * see hacker rank page 207 for good solution, with storing second stack with min elements 
 * @author z993415
 *
 */
public class StackWithMinElement {
		ListNodeWith2Vals head ;
		
		public StackWithMinElement () {
			head = null;
		}
		
		public void push(int a) {
			ListNodeWith2Vals l1;
			if (head == null) {
				l1 = new ListNodeWith2Vals(a, a);
				head = l1;
			}else {
				int min = Math.min(a,  (int)head.valP);
				l1 = new ListNodeWith2Vals(a, min);
				l1.next = head;
				l1 = head;
			}
		}
		
		public Object minElemenet() {
			return head.valP;
		}
		
		public Object pop() {
			int val = (int) head.val;
			head = head.next;
			return val;
		}
}
