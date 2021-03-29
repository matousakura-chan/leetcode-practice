package com.chen.leetcode.TwoOne;

import com.chen.common.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode dummy1 = l1;
        ListNode dummy2 = l2;

        ListNode dummy = new ListNode(0,l1.val<=l2.val?l1:l2);
        ListNode head = new ListNode(0,dummy.next);

        if(dummy.next.equals(dummy1)) dummy1 = dummy1.next;
        else dummy2 = dummy2.next;

        dummy = dummy.next;

        while (dummy1!=null&&dummy2!=null){
            if(dummy1.val<=dummy2.val){
                dummy.next = dummy1;
                dummy1 = dummy1.next;
                dummy = dummy.next;
            }else {
                dummy.next = dummy2;
                dummy2 = dummy2.next;
                dummy = dummy.next;
            }
        }

        if(dummy1 == null) dummy.next = dummy2;
        else dummy.next = dummy1;

        return head.next;
    }
}
