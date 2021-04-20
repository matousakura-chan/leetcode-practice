package com.chen.SwordForOffer.TwoFour;

import com.chen.common.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null||head.next == null) return head;

        ListNode next = head.next;
        head.next = null;
        ListNode newHead = reverseList(next);
        next.next = head;
        return newHead;
    }
}