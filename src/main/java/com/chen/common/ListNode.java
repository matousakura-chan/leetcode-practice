package com.chen.common;

public class ListNode {
    public int val;
    public ListNode next;

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
        while (curr.next != null) {
            System.out.print(curr.val);
            curr = curr.next;
            System.out.print("->");
        }
        System.out.println(curr.val);
    }
}