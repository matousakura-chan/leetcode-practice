package com.chen.leetcode.SevenSeven;

import java.util.ArrayList;
import java.util.List;


//防止重复 可以从后面加 保证顺序
public class Solution {

    public List<List<Integer>> combine(int n, int k) {

        if (n == 0) return null;

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(i + 1);
        }
        backTrack(lists, list, nums, n, k, 0);
        return lists;
    }

    void backTrack(List<List<Integer>> lists, List<Integer> list,
                   List<Integer> nums, int n, int k, int star) {
        if (k == 0) {
            List<Integer> temp = new ArrayList<>(list);
            lists.add(temp);
            return;
        }

        for (int i = star; i < nums.size(); i++) {
            list.add(new Integer(nums.get(i)));
            backTrack(lists, list, nums, n, k - 1, ++star);
            list.remove(list.size() - 1);
        }
    }
}
