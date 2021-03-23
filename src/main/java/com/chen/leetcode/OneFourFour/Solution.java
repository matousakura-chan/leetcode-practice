package com.chen.leetcode.OneFourFour;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<Integer> res = new LinkedList<>();

    public List<Integer> postorderTraversal(TreeNode root) {

        traversal(root);
        return res;
    }

    public void traversal(TreeNode root) {

        if (root == null) return;

        if (root.left != null) traversal(root.left);
        if (root.right != null) traversal(root.right);
        res.add(root.val);

    }

}
