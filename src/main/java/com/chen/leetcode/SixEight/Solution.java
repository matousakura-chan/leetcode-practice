package com.chen.leetcode.SixEight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> sub = new ArrayList<>();
    HashSet<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> subsets(int[] nums) {

        for (int i = 0; i < nums.length; i++)
            create(i, nums);

        for (List<Integer> sub : set) {
            res.add(sub);
        }

        List<Integer> array = new ArrayList<Integer>();
        for (Integer i : nums) {
            array.add(i);
        }
        res.add(array);
        return res;
    }

    void create(int n, int[] nums) {
        if (sub.size() == n) {
            List<Integer> temp = new ArrayList<>(sub);
            temp.sort((n1, n2) -> n1 - n2);
            set.add(temp);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!sub.contains(nums[i])) {
                sub.add(nums[i]);
                create(n, nums);
                sub.remove(sub.size() - 1);
            }
        }
    }
}