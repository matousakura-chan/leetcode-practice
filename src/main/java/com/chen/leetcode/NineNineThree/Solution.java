package com.chen.leetcode.NineNineThree;

import com.chen.common.TreeNode;

import java.util.*;

public class Solution {

    public boolean isCousins(TreeNode root, int x, int y) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode parent = null;

        while (!queue.isEmpty()){
            HashMap<Integer,TreeNode> map = new HashMap<>();
            int count =  queue.size();
            while (count != 0){
                TreeNode node = queue.poll();
                if(node != null){
                    if(node.left != null){
                        queue.offer(node.left);
                        if(node.left.val==x||node.left.val==y)
                            map.put(node.left.val,node);
                        queue.offer(node.left);
                    }
                    if(node.right != null){
                        queue.offer(node.right);
                        if(node.right.val==x||node.right.val==y)
                            map.put(node.right.val,node);
                        queue.offer(node.right);
                    }
                }
                count --;
            }
            if(map.size() == 2){
                TreeNode node = null;
                for (Integer integer : map.keySet()) {
                    if(node == null)
                        node = map.get(integer);
                    else if(!node.equals(map.get(integer)))
                        return true;
                }
            }
        }
        return false;
    }
}
