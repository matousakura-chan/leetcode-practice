package com.chen.SwordForOffer.ThreeTwo.Three;

import com.chen.common.TreeNode;

import java.util.*;

public class Solution {

    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root != null) queue.add(root);
        boolean reverse = false;

        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int num = queue.size();
            while (num-->0){
                TreeNode node = queue.remove();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if(reverse)
                Collections.reverse(list);
            reverse = !reverse;
            res.add(list);
        }
        return res;
    }
}
