package com.chen.leetcode.SevenFourZero;

import java.util.Arrays;

public class Solution {
    public int deleteAndEarn(int[] nums) {

        Arrays.sort(nums);

        int [] count = new int[nums[nums.length-1]+1];
        int [] dp = new int[nums[nums.length-1]+1];

        for(int num:nums)
            count[num]++;

        dp[1] = count[1];
        for (int i = 2;i<dp.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+i*count[i]);
        }
        return dp[dp.length-1];

    }
}