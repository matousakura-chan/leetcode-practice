package com.chen.leetcode.SevenZeroFive;

import java.util.ArrayList;

public class MyHashSet {

    class Node {
        int nums = 0;
        Node next = null;

        Node() {
        }

        Node(int nums) {
            this.nums = nums;
        }

        public Node add(Node node) {
            this.next = node;
            return node;
        }
    }

    Node[] array = new Node[100];


    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {

    }

    public void add(int key) {
        if (contains(key)) return;
        int num = key % 100;
        Node node = new Node(key);
        if (array[num] == null) array[num] = node;
        else {
            Node n = array[num];
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void remove(int key) {
        int num = key % 100;
        if (array[num] == null) return;
        if (array[num].nums == key)
            array[num] = array[num].next;
        else {
            Node n = array[num];
            Node p = null;
            while (n != null && n.nums != key) {
                p = n;
                n = n.next;
            }
            if (n == null) return;
            p.next = n.next;
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int num = key % 100;
        if (array[num] == null) return false;
        if (array[num].nums == key) return true;
        else {
            Node n = array[num];
            Node p = null;
            while (n != null && n.nums != key) {
                p = n;
                n = n.next;
            }
            if (n == null) return false;
            return true;
        }
    }

    public void printMyMap() {
        for (Node n : array) {
            if (n != null) {
                while (n != null) {
                    System.out.print(n.nums + "->");
                    n = n.next;
                }
                System.out.println();
            }
        }
    }

}
