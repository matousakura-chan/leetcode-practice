package com.chen.leetcode.EightNineSeven;

import com.chen.common.TreeNode;

public class Solution {

    TreeNode head;
    TreeNode pre;
    public TreeNode increasingBST(TreeNode root) {
        LDR(root);
        return head;
    }

    private void LDR(TreeNode root){

        if(root == null) return;
        LDR(root.left);

        if(head == null) head = root;
        if(pre!=null) {
            pre.right = root;
        }
        root.left = null;
        pre = root;

        LDR(root.right);

    }
}