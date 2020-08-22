package com.example.leec.zijie;

import com.example.leec.ListNode;

import java.util.LinkedList;

public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int addToOne = 0;
        while (l1 != null || l2 != null || addToOne != 0) {
            int l1_val = l1 != null ? l1.val : 0;
            int l2_val = l2 != null ? l2.val : 0;
            int sum = l1_val + l2_val + addToOne;

            addToOne = sum / 10;
            sum = sum % 10;

            head.next = new ListNode(sum);
            head = head.next;

            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
}
