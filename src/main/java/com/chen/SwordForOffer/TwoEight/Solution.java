package com.chen.SwordForOffer.TwoEight;

import com.chen.common.TreeNode;

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return isSubSymmetric(root,root);
    }

    private boolean isSubSymmetric(TreeNode root1,TreeNode root2) {

        if(root1==null&&root2==null) return true;
        if(root1==null||root2==null) return false;
        if(root1.val!=root2.val) return false;

        return isSubSymmetric(root1.right,root2.left)&&isSubSymmetric(root1.left,root2.right);
    }
}
