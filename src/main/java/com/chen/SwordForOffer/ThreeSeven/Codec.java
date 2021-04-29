package com.chen.SwordForOffer.ThreeSeven;

import com.chen.common.TreeNode;

import java.util.Arrays;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    private int deep;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "null";
        deep = getDeep(root);
        return getSerialize(root,0);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        return null;

    }

    private String getSerialize(TreeNode root,int d) {
        if(root == null) return d == deep?"":"null";
        return String.valueOf(root.val)+","+getSerialize(root.left,d+1)+","+getSerialize(root.right,d+1);
    }

    private int getDeep(TreeNode root){
        return root == null ? 0 : 1 + Math.max(getDeep(root.left), getDeep(root.right));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));