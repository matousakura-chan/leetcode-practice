package com.chen.leetcode.TwoOneThree;

import java.util.Arrays;

public class Solution {

    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(subRob(nums,0,nums.length-2),
                        subRob(nums,1,nums.length-1) );
    }

    public int subRob(int[] nums,int start,int end) {

        if(end - start == 1) return Math.max(nums[start], nums[end]);

        int [] dp = new int[end - start + 1];

        dp[0] = nums[start];
        dp[1] = Math.max(nums[start],nums[start+1]);

        for (int i = start + 2; i <= end;i++) {
            dp[i - start] = Math.max(dp[i-2- start]+nums[i],dp[i-1- start]);
        }

        //System.out.println(Arrays.toString(dp));
        return dp[end - start];
    }
}
