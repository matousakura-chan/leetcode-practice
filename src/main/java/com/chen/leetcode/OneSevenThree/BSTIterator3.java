package com.chen.leetcode.OneSevenThree;

import com.chen.common.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class BSTIterator3 {

    private TreeNode current;
    private Stack<TreeNode> stack;


    public BSTIterator3(TreeNode root) {
        current = root;
    }

    public int next() {

        while (current!=null){
            stack.push(current);
            current = current.left;
        }

        current = stack.pop();
        int res = current.val;
        current = current.right;
        return res;
    }

    public boolean hasNext() {
        return current!=null||!stack.isEmpty();
    }
}
