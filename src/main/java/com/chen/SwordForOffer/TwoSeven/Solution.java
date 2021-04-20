package com.chen.SwordForOffer.TwoSeven;

import com.chen.common.TreeNode;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {

        if(root == null) return null;

        TreeNode temp = root.right;

        root.right = mirrorTree(root.left);
        root.left = mirrorTree(temp);

        return root;
    }
}
