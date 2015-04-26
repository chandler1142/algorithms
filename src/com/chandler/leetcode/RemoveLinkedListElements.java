package com.chandler.leetcode;

/**
 * 
 * Remove all elements from a linked list of integers that have value val.
 * 
 * Example Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6 Return: 1 -->
 * 2--> 3 --> 4 --> 5
 * 
 */
public class RemoveLinkedListElements {

	public class ListNode {
		int val;
		ListNode next;

		public ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		
		while (head != null  && head.val == val)
			head = head.next;
		
		if (head == null)
			return null;
		ListNode p = head;
		ListNode q = head.next;
		while (q != null) {
			
			if( q.val == val){
				p.next = q.next;
				q = q.next;
			} else {
				p = p.next;
				q = q.next;
			}
		}
		return head;

	}

	public static void main(String[] args) {
		RemoveLinkedListElements r = new RemoveLinkedListElements();
		ListNode head0 =  r. new ListNode(3);
		ListNode head1 =  r. new ListNode(2);
		ListNode head2 =  r. new ListNode(6);
		ListNode head3 =  r. new ListNode(3);
		ListNode head4 =  r. new ListNode(4);
		ListNode head5 =  r. new ListNode(5);
		ListNode head6 =  r. new ListNode(6);
		head0.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = head6;
		head6.next = null;
		
		
		ListNode p = r.removeElements(head0,6);
		while(p != null) {
			if(p.next != null) System.out.print(p.val+"->");
			else System.out.println(p.val);
			p = p.next;
		}
	}

}
