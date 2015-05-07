package com.chandler.offer;

/*
 * 删除链表中重复节点
 * 
 */
public class offer57 {
	
	
	public static ListNode solution(ListNode head) {
		
		if( head == null) return null;
		ListNode p = head;
		ListNode pre = null;
		
		while( p != null) {
			ListNode pNext = p.next;
			boolean needDelete = false;
			if(pNext != null && pNext.val == p.val) {
				needDelete = true;
			}
			
			if(!needDelete) {
				pre = p;
				p = p.next;
			} else  {
				int value = p.val;
				ListNode pToBeDel = p;
				while(pToBeDel != null && pToBeDel.val == value) {
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {

	}

}
