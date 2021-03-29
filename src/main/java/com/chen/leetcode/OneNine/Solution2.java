package com.chen.leetcode.OneNine;

import com.chen.common.ListNode;

public class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) return null;
        ListNode first = new ListNode(0,head);
        ListNode second = new ListNode(0,head);
        ListNode dummy = new ListNode(0,head);

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        while (first != null){
            first = first.next;
            second = second.next;
        }
        if(second.next.equals(dummy.next)) return dummy.next.next;

        second.next = second.next.next;
        return dummy.next;
    }

}
