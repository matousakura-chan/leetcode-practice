package com.chen.leetcode.OneFiveThree;

public class Solution {

    public int findMin(int[] nums) {

        if(nums.length == 0) return -1;
        if(nums.length == 1||nums[0]<nums[nums.length-1]) return nums[0];

        int l = 0,r = nums.length-1;
        while (l<r){
            int m = (l+r)/2;
            if(nums[m]>nums[r]) l = m + 1;
            if(nums[m]<nums[r]) r = m ;
         }

        return nums[l];
    }
}
