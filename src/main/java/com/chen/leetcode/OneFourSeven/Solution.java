package com.chen.leetcode.OneFourSeven;

import com.chen.common.ListNode;

public class Solution {

    public ListNode insertionSortList(ListNode head) {

        //放过来
        int length = 0;
        ListNode temp = head; //临时

        while (temp != null) {
            temp = temp.next;
            length++;
        }
        if (length < 2) return head;

        ListNode res = null;

        for (int i = 0; i <= length - 2; i++) {

            ListNode subPrev = new ListNode(0); //寻找子链
            subPrev.next = head;
            int k = length - 2 - i;
            while (k > 0) {
                subPrev = subPrev.next;
                k--;
            }

            ListNode curr = subPrev.next;  //子链
            ListNode prMove = curr;     //移动
            ListNode move = curr.next;   //移动

            while (move != null) {      //遍历找大的前一位就是
                if (move.val > curr.val) {
                    break;
                }
                prMove = move;
                move = move.next;
            }
            if (!prMove.equals(curr)) {
                subPrev.next = curr.next;
                curr.next = prMove.next;
                prMove.next = curr;
            }
            res = subPrev.next;
        }
        return res;
    }
}

//头指针有问题