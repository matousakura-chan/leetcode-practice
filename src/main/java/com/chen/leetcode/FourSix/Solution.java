package com.chen.leetcode.FourSix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> permute(int[] nums) {

        if (nums.length == 0) return null;

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backTrack(lists, list, nums);
        return lists;
    }

    void backTrack(List<List<Integer>> lists, List<Integer> list,
                   int[] nums) {
        if (list.size() == nums.length) {
            List<Integer> temp = new ArrayList<>(list);
            lists.add(temp);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(new Integer(nums[i]));
                backTrack(lists, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }
}

