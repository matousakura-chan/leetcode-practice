package com.chen.SwordForOffer.TwoTwo;

import com.chen.common.ListNode;

class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode s = head;
        ListNode f = head;
        int count = k;
        while (count>0){
            f = f.next;
            count--;
        }
        while (f!=null){
            f = f.next;
            s = s.next;
        }
        return s;
    }
}