package com.chen.leetcode.OneFourOne;

public class Solution {

    public boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode s = head;
        ListNode f = head.next;

        while (f != null && s != null) {
            if (s == f) {
                return true;
            }
            s = s.next;
            if (f.next == null) return false;
            f = f.next.next;
        }
        return false;
    }

}
