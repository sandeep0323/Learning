package com.learning.crackingcodinginterview;

import com.objects.ListNode;
/**
 * Implement an algorithm to find the kth to last element of a singly linked list
 * @author z993415
 *
 */
public class KthToLastElementOfSingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Iterative
	public static int findKthToLastElementOfSingleLinkedList(ListNode head, int k) {
		if (k<1) {
			return 0;
		}
		ListNode runnable = head;
		while (k > 1) {
			runnable = runnable.next;
			k = k -1;
			if (runnable == null) {
				return 0;
			}
		}
		
		while (runnable.next!=null) {
			head = head.next;
			runnable = runnable.next;
		}
		return (int)head.val;
	}
	
	//recursive
	public static int findKthToLastElementOfSingleLinkedListV2(ListNode head, int k) {
		if (head ==null) {
			return 0;
		}
		int i = findKthToLastElementOfSingleLinkedListV2(head.next, k)+ 1;
		if (i == k) {
			return (int)head.val;
		}
		return 0;
 	}

}
