package com.chen.leetcode.OneFourSeven;

import com.chen.common.ListNode;

public class Solution02 {
    public ListNode sortList(ListNode head) {
        return sortList(head, null);
    }

    //归并排序
    public ListNode sortList(ListNode head,ListNode tail) {

        if(head == tail) return head;
        if(head.next == tail){
            //两个相连 拆开
            head.next = null;
            return head;
        }

        ListNode mid = head;
        ListNode fast = head;
        //找中点
//        while (fast!=null&&fast!=tail){
//            mid = mid.next;
//            fast = mid.next;
//        }
        //上一种找中点回超时
        while (fast != tail) {
            mid = mid.next;
            fast = fast.next;
            if (fast != tail) {
                fast = fast.next;
            }
        }

        ListNode l1 = sortList(head,mid);
        ListNode l2 = sortList(mid,tail);
        return mergeTwoLists(l1,l2);
    }
    //21.合并两个排序数组，最小两个节点也能排序，归并后就是 leetcode 21题了
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val<=l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}

