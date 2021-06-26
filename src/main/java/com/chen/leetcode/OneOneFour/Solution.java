package com.chen.leetcode.OneOneFour;

import com.chen.common.TreeNode;

public class Solution {

    TreeNode last = null;
    public void flatten(TreeNode root) {

        if(root == null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;

        if(last!=null){
            last.right = root;
            last.left = null;
        }
        last = root;
        flatten(left);
        flatten(right);
    }
}
