package com.chen.leetcode.TwoThree;

import com.chen.common.ListNode;

public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];

        ListNode head = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head = merge(head,lists[i]);
        }
        return head;
    }

    public ListNode merge(ListNode l1,ListNode l2){

        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1.val<=l2.val){
            l1.next = merge(l1.next,l2);
            return l1;
        }else{
            l2.next = merge(l2.next,l1);
            return l2;
        }

    }
}
