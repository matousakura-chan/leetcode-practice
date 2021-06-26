package com.chen.leetcode.OneThreeSix;

public class Solution {
    public int singleNumber(int[] nums) {

        int res = 0;
        for (int num : nums) {
            res^=num;
        }
        return res;

    }
}