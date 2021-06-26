package com.chen.leetcode.FourOneSix;

import java.util.Arrays;

/**
 * 416. 分割等和子集
 * 给你一个 只包含正整数 的 非空 数组 nums 。
 * 请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * 2021.6.24 13:48
 */

public class Solution {

    public boolean canPartition(int[] nums) {

        int target = 0;
        for (int num : nums) {
            target += num;
        }
        if(target%2 == 1) return false;
        target = target/2;

        boolean dp[][] = new boolean[nums.length + 1][target+1];
        //Arrays.fill(dp,false);
        //nums 前 i 个组成
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                //状态转移
                if(j == nums[i - 1]) dp[i][j] = true;
                if(j > nums[i - 1]) dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
            }
        }

        return dp[nums.length][target];
    }
}
