package com.chen.SwordForOffer.ThreeTwo.Two;

import com.chen.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root != null) queue.add(root);

        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int num = queue.size();
            while (num-->0){
                TreeNode node = queue.remove();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(list);
        }
        return res;
    }
}