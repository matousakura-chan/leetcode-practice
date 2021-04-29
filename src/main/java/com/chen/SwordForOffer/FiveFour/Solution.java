package com.chen.SwordForOffer.FiveFour;

import com.chen.common.TreeNode;

public class Solution {

    int count;
    int target;
    int res;
    boolean isFind;
    public int kthLargest(TreeNode root, int k) {
        target = k;
        dfs(root);
        return res;
    }


    private void dfs(TreeNode root){
        if(root == null||isFind) return;

        dfs(root.right);
        count++;
        if(count == target) {
            isFind = true;
            res = root.val;
        }
        dfs(root.left);
    }
}
