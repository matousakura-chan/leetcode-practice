package com.chen.leetcode.OneZeroTwo;

import com.chen.common.TreeNode;

import java.util.*;

public class Solution {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    Queue<TreeNode> queue1 = new LinkedList<>();
    Queue<TreeNode> queue2 = new LinkedList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) return null;

        queue1.offer(root);

        while (queue1.size() != 0 || queue2.size() != 0) {
            while (queue1.size() != 0) {
                if (queue1.peek().left != null) queue2.offer(queue1.peek().left);
                if (queue1.peek().right != null) queue2.offer(queue1.peek().right);
                list.add(queue1.poll().val);
            }
            if (list.size() != 0) res.add(new ArrayList<>(list));
            list.clear();
            while (queue2.size() != 0) {
                if (queue2.peek().left != null) queue1.offer(queue2.peek().left);
                if (queue2.peek().right != null) queue1.offer(queue2.peek().right);
                list.add(queue2.poll().val);
            }
            if (list.size() != 0) res.add(new ArrayList<>(list));
            list.clear();
        }

        Collections.reverse(res);
        return res;
    }

}

