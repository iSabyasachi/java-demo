package com.java.linkedlist;

class ListNode{
	int value;
	ListNode next;
	
	public ListNode(int value){
		this.value = value;
	}
	
}
public class PalindromeLinkedList {
	public static void main(String[] args) {
		PalindromeLinkedList obj = new PalindromeLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        
        System.out.println(obj.isPalindrome(head));
        
	}
	
	public boolean isPalindrome(ListNode head) {
		if(head == null) return true;
		
		ListNode firstHalfEnd = findMiddleNode(head);
		ListNode secondHalfFirst = reverseList(firstHalfEnd.next);
		
		ListNode p1 = head;
		ListNode p2 = secondHalfFirst;
		
		boolean result = true;
		while(result && p1 != null & p2 != null) {
			if(p1.value != p2.value) return false;
			p1 = p1.next;
			p2 = p2.next;
		}
		firstHalfEnd.next = reverseList(secondHalfFirst);
		while(head != null) {
			System.out.print(head.value+" ");
			head = head.next;
		}
		return result;
	}
	public ListNode findMiddleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while(curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
}
