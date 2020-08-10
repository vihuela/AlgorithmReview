package com.example.leec.double_point;


import com.example.leec.utils.PrintUtil;

import java.util.HashSet;

public class FastSlowPoint {
    public static void main(String[] args) {
    }

    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> s = new HashSet<>();
        while (head != null) {
            if (s.contains(head)) {
                return true;
            } else {
                s.add(head);
                head = head.next;
            }
        }
        return false;
    }


    public static boolean slowAndFastSolution(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
    }



    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}