package com.chen.leetcode.ThreeThreeSeven;

import com.chen.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
public class Solution {

    List<Integer> list;

    public int rob(TreeNode root) {

        list = new ArrayList<>();
        LDR(root);

        return 0;

    }

    private void LDR(TreeNode root){

        if(root == null) return;
        LDR(root.left);
        list.add(root.val);
        LDR(root.right);
    }
}
