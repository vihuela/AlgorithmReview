package com.example.leec;

public class ReverseLinkedList {

//    Reverse a singly linked list.
//
//            Example:
//
//    Input: 1->2->3->4->5->NULL
//    Output: 5->4->3->2->1->NULL


    public static void main(String[] args) {
        ListNode l0 = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        l0.next = l1;
        l1.next = l2;
        l2.next = l3;

        System.out.println(l0);
        reverseList(l0);
        System.out.println(l3);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }


    private static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
