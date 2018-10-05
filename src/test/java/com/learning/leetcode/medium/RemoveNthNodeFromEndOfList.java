package com.learning.leetcode.medium;

import com.objects.ListNode;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.add(2);
		head.add(3);
		head.add(4);
		head.add(5);
		head.print(removeNthFromEnd(head, 2));
//		ListNode head = new ListNode(1);
//		head.add(2);
//		head.print(removeNthFromEnd(head, 1));
				
	}
	
	 public static ListNode removeNthFromEnd(ListNode head, int n) {
	     ListNode main = head;
	     ListNode temp = head;
	     while (n > 0) {
	    	 temp = temp.next;
	    	 n--;
	     }
	     while (temp!=null && temp.next!=null) {
	    	 main = main.next;
	    	 temp = temp.next;
	     }
	     if (main.next!=null && temp!=null) {///below code no need to have this else if , because of i temp node added at starting
	    	 main.next = main.next.next;
	     }else {
	    	 return main.next;
	     }
		 return head;
	  }

}


//public ListNode removeNthFromEnd(ListNode head, int n) {
//    ListNode dummy = new ListNode(0);
//    dummy.next = head;
//    ListNode first = dummy;
//    ListNode second = dummy;
//    // Advances first pointer so that the gap between first and second is n nodes apart
//    for (int i = 1; i <= n + 1; i++) {
//        first = first.next;
//    }
//    // Move first to the end, maintaining the gap
//    while (first != null) {
//        first = first.next;
//        second = second.next;
//    }
//    second.next = second.next.next;
//    return dummy.next;
//}
