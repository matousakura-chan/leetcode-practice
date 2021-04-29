package com.chen.SwordForOffer.ThreeSeven.other;

import com.chen.common.TreeNode;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
//        if(root == null) return "null";
        return String.valueOf(root.val)+","+serialize(root.left)+","+serialize(root.right);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }
}