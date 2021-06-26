package com.chen.leetcode.NIneEight;

import com.chen.common.TreeNode;

class Solution {

    boolean flag = true;
    TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        dfs(root);
        return flag;
    }

    private void dfs(TreeNode root) {

        if(root == null) return;
        dfs(root.left);

        if(prev==null)
            prev = root;
        else {
            if(prev.val>=root.val)
                flag = false;
            prev = root;
        }
        dfs(root.right);
    }
}
