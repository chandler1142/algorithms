package com.chandler.leetcode;

/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode p = head.next;
        head.next = null;
        while(p!=null) {
            ListNode q = p.next;
            p.next = head;
            head = p;
            p = q;
        }
        return head; 

    }

}