package com.chen.leetcode.ThreeFive;

public class Solution {
    public int searchInsert(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;
        int m = 0;
        while (i <= j) {
            m = i + (j - i) / 2;
            System.out.println("out" + i + j + m);
            if (nums[m] == target) return m;
            if (nums[m] < target) i = m + 1;
            else j = m - 1;
        }
        return i;

    }
}
