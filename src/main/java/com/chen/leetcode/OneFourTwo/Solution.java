package com.chen.leetcode.OneFourTwo;

import com.chen.common.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null||head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        do {
            if(fast == null||fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
        } while (slow != fast);
        ListNode res = head;
        while (res != slow){
            res = res.next;
            slow = slow.next;
        }
        return res;

    }
}