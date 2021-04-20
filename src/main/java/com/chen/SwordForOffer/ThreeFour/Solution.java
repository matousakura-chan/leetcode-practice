package com.chen.SwordForOffer.ThreeFour;

import com.chen.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> list = new ArrayList<>();
    List<Integer> subList = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root == null) return list;
        backtracking(root,target);
        return list;
    }
    private void backtracking(TreeNode root, int release){

        if(root==null) return;
        release -= root.val;
        subList.add(root.val);

        if(release == 0&&root.left == null&&root.right==null){
            list.add(new ArrayList<>(subList));
            release += root.val;
            subList.remove(subList.size()-1);
            return;
        }

        backtracking(root.left,release);
        backtracking(root.right,release);

        release += root.val;
        subList.remove(subList.size()-1);
    }
}