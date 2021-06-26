package com.chen.leetcode.OneTwoEight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        int res = 0;
        int current = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if(!set.contains(num - 1)){
                current = 1;
                while (set.contains(num+current)){
                    current++;
                }
            }
            res = Math.max(res,current);
        }
        return res;
    }
}