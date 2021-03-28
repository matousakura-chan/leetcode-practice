package com.chen.leetcode.TwoZeroEight;

public class Trie {

    class Node{
        char val;
        boolean isEnd;
        Node[] next = new Node[26];
        Node(){ }
        public void change(){
            this.isEnd = !this.isEnd;
        }

        public Node(char val, boolean isEnd) {
            this.val = val;
            this.isEnd = isEnd;
        }

        public void setVal(char val) {
            this.val = val;
        }

        public void setEnd(boolean end) {
            isEnd = end;
        }

        public void setNext(char c,boolean flag) {
            if(next[c-'0'-49] != null) return;
            Node node = new Node(c,flag);
            next[c-'0'-49] = node;
        }

        public char getVal() {
            return val;
        }

        public boolean isEnd() {
            return isEnd;
        }

        public Node getNext(char c) {
            return next[c-'0'-49];
        }
    }

    Node root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new Node('0', false);
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word == null) return;
        char[] chars = word.toCharArray();
        Node curr = root;
        for (char c:chars) {
            curr.setNext(c,false);
            curr = curr.getNext(c);
        }
        curr.change();
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word == null) return false;
        char[] chars = word.toCharArray();
        Node curr = root;
        for (char c:chars) {
            if(curr.getNext(c)==null) return false;
            curr = curr.getNext(c);
        }
        if(curr.isEnd) return true;
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix == null) return false;
        char[] chars = prefix.toCharArray();
        Node curr = root;
        for (char c:chars) {
            if(curr.getNext(c)==null) return false;
            curr = curr.getNext(c);
        }
        return true;
    }
}