package com.chen.leetcode.OneSevenThree;

import com.chen.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

class BSTIterator2 {
    private TreeNode cur;
    private Deque<TreeNode> stack;

    public BSTIterator2(TreeNode root) {
        cur = root;
        stack = new LinkedList<TreeNode>();
    }

    public int next() {
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        int ret = cur.val;
        cur = cur.right;
        return ret;
    }

    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }
}