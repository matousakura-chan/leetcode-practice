package com.chen.leetcode.OneNine;

import com.chen.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) return null;

        List<ListNode> list = new ArrayList<>();

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while (head!=null){
            list.add(head);
            head = head.next;
        }
        if(list.size()==n) return dummy.next;
        list.get(list.size()-n-1).next = list.get(list.size()-n-1).next.next;
        return dummy.next;
    }
}
