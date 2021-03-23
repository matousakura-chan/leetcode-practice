package com.chen.leetcode.NineThreeEight;

import com.chen.common.TreeNode;

public class Solution {

    public int rangeSumBST(TreeNode root, int low, int high) {

        int res = 0;
        dfs(root, low, high, res);
        return res;

    }

    void dfs(TreeNode root, int low, int high, int res) {

        if (root != null && root.val >= low && root.val <= high) {
            res = res + root.val;
            root.val = 0;
        }

        if (root != null) {
            dfs(root.left, low, high, res);
            dfs(root.right, low, high, res);
        }
    }
}
