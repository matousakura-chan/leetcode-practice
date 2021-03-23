package com.chen.leetcode.SevenNine;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> subs = new ArrayList<>();
            for (List<Integer> sub : res) {
                List<Integer> temp = new ArrayList<>(sub);
                subs.add(temp);
            }
            for (List<Integer> sub : subs) {
                sub.add(num);
            }
            res.addAll(subs);
        }
        return res;
    }
}
