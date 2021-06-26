package com.chen.leetcode.OneSixZero;

import com.chen.common.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lengthA = 0;
        int lengthB = 0;

        ListNode node = headA;
        while (node!=null){
            lengthA++;
            node = node.next;
        }
        node = headB;
        while (node!=null){
            lengthB++;
            node = node.next;
        }

        if(lengthA>lengthB){
            int count = lengthA - lengthB;
            while (count != 0){
                headA = headA.next;
                count--;
            }
        }
        if(lengthA<lengthB){
            int count = lengthB - lengthA;
            while (count != 0){
                headB = headB.next;
                count--;
            }
        }

        while (headA!=null){
            if(headA.equals(headB)) return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}