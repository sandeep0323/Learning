package com.learning.leetcode.medium;

import com.objects.ListNode;

public class SwapNodesInPairs {
	/**
	 * https://leetcode.com/problems/swap-nodes-in-pairs/description/
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode swapPairs(ListNode head) {
	        if (head!=null && head.next!=null){
	            ListNode temp = head.next;
	            head.next = head.next.next;
	            temp.next = head;
	            head = temp;
	            head.next.next = swapPairs(head.next.next);
	        }
	        return head;
	    }

}
