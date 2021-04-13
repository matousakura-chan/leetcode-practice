package com.chen.leetcode.OneFiveFour;

public class Solution {

    public int findMin(int[] nums) {

        if(nums.length == 0) return -1;
        if(nums.length == 1||nums[0]<nums[nums.length-1]) return nums[0];

        int l = 0,r = nums.length-1,m = 0;

        while (l<r){
            while (nums[l]==nums[l+1]){
                if(++l == r) return nums[l];
            }
            while (nums[r]==nums[r-1]){
                if(l == --r) return nums[r];
            }
            m = (l+r)/2;
            if(nums[m]>nums[r]) l = m+1;
            if(nums[m]<nums[r]) r = m;
        }

        return nums[l];
    }
}
