package com.chen.leetcode.OneZeroFive;


import com.chen.common.TreeNode;

import java.util.HashMap;

public class Solution {

    HashMap<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i],i);
        }
        return build(preorder,0,preorder.length,0);

    }

    private TreeNode build(int[] preorder,int pL,int pR,int iL) {

        if(pL>pR) return null;
        TreeNode node = new TreeNode(preorder[pL]);
        int index = inorderMap.get(preorder[pL]);
        int leftSize = index - iL;
        node.left = build(preorder,pL+1,pL+ leftSize,iL + 1);
        node.right = build(preorder,pL+ leftSize +1,pR,iL + leftSize);
        return node;
    }
}
