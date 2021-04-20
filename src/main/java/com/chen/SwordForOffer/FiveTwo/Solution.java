package com.chen.SwordForOffer.FiveTwo;

import com.chen.common.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode dummy = headA;
        int countA = 0,countB=0;
        while (dummy!=null){
            countA++;
            dummy = dummy.next;
        }

        dummy = headB;
        while (dummy!=null){
            countB++;
            dummy = dummy.next;
        }
        ListNode dummyA = headA,dummyB = headB;
        int between = countA -countB;
        if(between<0){
            while (between++<0){
                dummyB = dummyB.next;
            }
        }else if(between>0){
            while (between-->0){
                dummyA = dummyA.next;
            }
        }

        while (!dummyA.equals(dummyB)){
            dummyA = dummyA.next;
            dummyB = dummyB.next;
        }
        return dummyA;
    }
}