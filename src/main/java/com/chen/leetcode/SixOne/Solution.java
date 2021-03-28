package com.chen.leetcode.SixOne;

import com.chen.common.ListNode;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null) return null;

        int length = 0;
        ListNode temp = new ListNode(0,head);
        while (temp!=null){
            temp = temp.next;
            length++;
        }
        temp.next = head;

        if(length == 1) return head;

        int need = length - k%length;
        ListNode curr = new ListNode(0,head);

        for (int i = 0; i < need; i++) {
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}
