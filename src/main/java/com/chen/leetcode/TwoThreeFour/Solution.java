package com.chen.leetcode.TwoThreeFour;

import com.chen.common.ListNode;

import java.util.List;

//反转后半部分链表 快慢指针比较
public class Solution {

    ListNode end = null;

    public boolean isPalindrome(ListNode head) {

        if (head == null) return false;
        if (head.next == null) return true;

        ListNode node = head;
        int num = 0;
        while (node != null) {
            node = node.next;
            num++;
        }
        //中间
        num /= 2;
        node = head;

        ListNode prve = null;
        for (int i = 0; i < num; i++) {
            prve = node;
            node = node.next;
        }
        //奇数
        if(num % 2 == 1){
            node.next = reverseNode(node.next);
            node = node.next;
        } else
            prve.next = reverseNode(node);

        while (node != null) {
            if (node.val != head.val)
                return false;
            node = node.next;
            head = head.next;
        }
        return true;
    }

    //反转链表
    public ListNode reverseNode(ListNode node) {
        //最后一个节点
        if (node == null|| node.next == null) {
            //end = node;
            return node;
        }

        ListNode next = node.next;
        node.next = null;
        ListNode newHead = reverseNode(next);
        next.next = node;
        return newHead;

    }
}