package com.chen.leetcode.TwoSix;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            if(nums[l] != nums[r])
                nums[++l] = nums[r];
        }

        for (int i = 0; i <= l; i++) {
            System.out.println(nums[i]);
        }

        return l+1;
    }

}
