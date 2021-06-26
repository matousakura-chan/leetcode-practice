package com.chen.leetcode.OneFourEight;

import com.chen.common.ListNode;

public class Solution {
    public ListNode sortList(ListNode head) {
        return sort(head);
    }

    private ListNode sort(ListNode node) {
        if(node == null)
            return null;

        ListNode finishSortList = sort(node.next);
        if(finishSortList == null)
            return node;

        if(node.val<=finishSortList.val){
            node.next = finishSortList;
            return node;
        }else{
            ListNode next = finishSortList;
            ListNode pre = null;
            while (next !=null &&node.val>next.val){
                pre = next;
                next = next.next;
            }
            if(next != null)
                node.next = next;
            else
                node.next = null;
            pre.next = node;
            return finishSortList;
        }
    }
}
