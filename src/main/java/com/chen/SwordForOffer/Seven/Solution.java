package com.chen.SwordForOffer.Seven;

import com.chen.common.TreeNode;

import java.util.HashMap;

public class Solution {

    HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }

        return reConstructBinaryTree(preorder,0,preorder.length-1,0);
    }

    private TreeNode reConstructBinaryTree(int[] preorder,int preL,int preR,int inL){

        if(preL>preR) return null;

        TreeNode node = new TreeNode(preorder[preL]);

        int inIndex =map.get(preorder[preL]);
        int leftTreeSize = inIndex - inL;

        node.left = reConstructBinaryTree(preorder,preL+1,preL+leftTreeSize,inL);
        node.right = reConstructBinaryTree(preorder,preL+leftTreeSize+1,preR,inIndex+1);

        return node;
    }
}
