package com.chen.leetcode.FourEightFive;

public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                res++;
            } else {
                res = 0;
                max = max > res ? max : res;
            }

        }
        max = max > res ? max : res;
        return max;
    }
}
