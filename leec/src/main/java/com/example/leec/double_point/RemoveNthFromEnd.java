package com.example.leec.double_point;


public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        print(l1);
        removeNthFromEnd(l1, 2);
        System.out.println("--------------");
        print(l1);

    }

    private static void print(ListNode head) {
        if (head != null) {
            System.out.println(head.val);
            if (head.next != null) {
                print(head.next);
            }
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode fast = res;
        ListNode slow = res;

        while (n-- > 0) {
            fast = fast.next;
        }
        //为了找到要删除的节点的前一个节点，所以此处让fast.next!=null
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //此时slow为倒数第n个节点的前一个节点。
        slow.next = slow.next.next;
        return res.next;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}