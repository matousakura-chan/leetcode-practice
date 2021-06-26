package com.chen.leetcode.OneTwoFour;

import com.chen.common.TreeNode;

public class Solution {

    int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        return dfs(root);
    }

    private int dfs(TreeNode root) {
        if(root == null) return 0;
        int leftMaxVal = dfs(root.left);
        int rightMaxVal = dfs(root.right);

        res = Math.max(res,root.val+leftMaxVal+rightMaxVal);
        return Math.max(root.val+Math.max(leftMaxVal,rightMaxVal), 0);
    }
}