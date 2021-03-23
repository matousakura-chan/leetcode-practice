package com.chen.leetcode.TwoZeroSix;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode add(int num) {
        ListNode node = new ListNode(num);
        this.next = node;
        return node;
    }

    public void print() {
        ListNode curr = this;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}