package com.chen.leetcode.SevenEightThree;

import com.chen.common.TreeNode;



public class Solution {

    private int res = Integer.MAX_VALUE;
    private int pre = -1;

    public int minDiffInBST(TreeNode root) {

        if(root == null) return -1;

        LDR(root);
        return res;
    }
    private void LDR(TreeNode root){

        if(root == null) return;
        LDR(root.left);
        if(pre == -1){
            pre = root.val;
        }else {
            res = Math.min(res, root.val - pre);
            pre = root.val;
        }
        LDR(root.right);
    }
}
