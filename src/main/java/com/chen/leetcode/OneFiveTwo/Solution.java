package com.chen.leetcode.OneFiveTwo;

import java.util.Stack;

public class Solution {

    public int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;
        int subMax = nums[0];
        int subMin = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if(nums[i]<0){
                int temp = subMax;
                subMax = subMin;
                subMin = temp;

            }
            subMax = Math.max(subMax,nums[i]*subMax);
            subMin = Math.min(subMin,nums[i]*subMin);
            max = Math.max(max,subMax);
        }
        return max;
    }
}
