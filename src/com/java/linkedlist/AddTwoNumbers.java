package com.java.linkedlist;
import java.util.*;


public class AddTwoNumbers{
    public static void main(String[] args){
        AddTwoNumbers obj = new AddTwoNumbers();

        ListNode list1 = new ListNode(2);
        list1.next= new ListNode(4);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next= new ListNode(6);
        list2.next.next = new ListNode(4);

        ListNode res = obj.addTwoNumbers(list1, list2);
        while(res != null){
            System.out.print(res.value + " ");
            res = res.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode curr = null;
        int rem = 0;
        while(l1 != null || l2 != null){
            int a = l1 != null ? l1.value : 0;
            int b = l2 != null ? l2.value : 0;
           
            int sum = a + b + rem;
            int digit = sum % 10;
            if(result == null){
            	result = new ListNode(digit);
            	curr = result;
            }else{
                curr.next = new ListNode(digit);
                curr = curr.next;  
            }            
            rem = sum / 10;                      
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }        
        return result;
    }
}