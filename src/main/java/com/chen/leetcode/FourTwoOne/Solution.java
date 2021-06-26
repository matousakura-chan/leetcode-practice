package com.chen.leetcode.FourTwoOne;

public class Solution {

    public int findMaximumXOR(int[] nums) {

        if(nums.length == 1) return 0;
        if(nums.length == 2) return nums[0]^nums[1];

        return 0;



    }
}
