package com.chen.SwordForOffer.FiveFive;

import com.chen.common.TreeNode;

public class Solution {

    boolean isBalance = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return isBalance;
    }

    private int dfs(TreeNode root){

        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(Math.abs(left-right)>1) isBalance = false;
        return 1+Math.max(left,right);
    }
}