package com.chen.common;

public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node add(int num) {
        Node node = new Node(num);
        this.next = node;
        return node;
    }

    public void print() {
        Node curr = this;
        while (curr.next != null) {
            System.out.print(curr.val);
            curr = curr.next;
            System.out.print("->");
        }
        System.out.println(curr.val);
    }
}