package com.chen.leetcode.EightSevenTwo;

import com.chen.common.TreeNode;
import java.util.ArrayList;

/**
 * dfs
 */

public class Solution {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        ArrayList<TreeNode> list1 = new ArrayList<>();
        ArrayList<TreeNode> list2 = new ArrayList<>();

        dfs(root1,list1);
        dfs(root2,list2);

        if(list1.size()!=list2.size()) return false;
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i)!=list2.get(i)) return false;
        }
        return true;
    }

    private void dfs(TreeNode root,ArrayList<TreeNode> list){

        if(root == null)
            return;
        dfs(root.left,list);
        dfs(root.right,list);
        if(root.left==null&&root.right==null)
            list.add(root);
    }

}
