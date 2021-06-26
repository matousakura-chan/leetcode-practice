package com.chen.SwordForOffer.FourTwo;

public class Solution {
    public int maxSubArray(int[] nums) {

        int temp = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if(i>0&&nums[i-1]>=0) nums[i] = nums[i]+nums[i-1];
            temp = Math.max(nums[i],temp);

        }
        return temp;
    }
}