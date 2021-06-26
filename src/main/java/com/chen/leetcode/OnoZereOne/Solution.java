package com.chen.leetcode.OnoZereOne;

import com.chen.common.TreeNode;

public class Solution {

    boolean flag = true;

    public boolean isSymmetric(TreeNode root) {
        dfs(root,root);
        return flag;
    }

    private void dfs(TreeNode root1,TreeNode root2) {

        if(root1==null){
            if(root2 != null){
                flag = false;
                return;
            }else
                return;
        }else {
            if(root2 == null){
                flag = false;
                return;
            }
        }

        if(root1.val!=root2.val){
            flag = false;
            return;
        }
        dfs(root1.left,root2.right);
        dfs(root1.right,root2.left);
    }
}
