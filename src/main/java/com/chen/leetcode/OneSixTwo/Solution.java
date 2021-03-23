package com.chen.leetcode.OneSixTwo;

public class Solution {
    public int findPeakElement(int[] nums) {

        if (nums.length == 1) return 0;
        if (nums.length == 2) return nums[0] > nums[1] ? 0 : 1;

        int i = 0;
        int j = nums.length - 1;
        int m = 0;
        while (i < j) {
            System.out.println("" + i + j + m);
            m = i + (j - i) / 2;
            if (nums[m] > nums[m + 1]) j = m;
            else i = m + 1;
        }
        return i;

    }
}
