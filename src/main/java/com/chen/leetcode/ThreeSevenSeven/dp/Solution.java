package com.chen.leetcode.ThreeSevenSeven.dp;

import java.util.HashMap;

public class Solution {


    public int combinationSum4(int[] nums, int target) {
        int [] dp = new int [target+1];

        for (int i = 0; i <= target; i++) {
            for (int num :nums){
                if(i-num>=0)
                    dp[i] += dp[i-num];
            }
        }
        return dp[target];
    }
}