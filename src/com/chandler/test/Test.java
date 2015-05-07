package com.chandler.test;

import com.chandler.leetcode.RemoveLinkedListElements.ListNode;

public class Test {
	public class ListNode {
		int val;
		ListNode next;

		public ListNode(int x) {
			val = x;
		}
	}
	
    public ListNode removeElements(ListNode head, int val) {
       if (head == null){
       	return null;
       }
       ListNode p = new ListNode(-1);
       p.next = head;
       ListNode pre = p;
       ListNode h = head;
       while (h != null){
       	if (h.val == val){
       		pre.next = h.next;
       	}
       	else {
       		pre = pre.next;
       	}
       	h = h.next;
       }
       return head;
   }
    public static void main(String args[]) {
    	Test t = new Test() ;
    	
    	ListNode head0 =  t.new ListNode(6);
		ListNode head1 =  t.new ListNode(2);
		ListNode head2 =  t.new ListNode(6);
		ListNode head3 =   t.new ListNode(3);
		ListNode head4 =  t.new ListNode(4);
		ListNode head5 =   t.new ListNode(5);
		ListNode head6 =  t.new ListNode(6);
		head0.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = head6;
		head6.next = null;
		
		
		ListNode p = t.removeElements(head0,6);
		while(p != null) {
			if(p.next != null) System.out.print(p.val+"->");
			else System.out.println(p.val);
			p = p.next;
		}
    }
}
