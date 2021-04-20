package com.chen.SwordForOffer.ThreeTwo.One;

import com.chen.common.TreeNode;

import java.util.*;

public class Solution {

    Queue<TreeNode> queue = new LinkedList<>();
    List<Integer> list = new ArrayList<>();

    public int[] levelOrder(TreeNode root) {

        if(root != null) queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-->0){
                TreeNode node = queue.remove();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
