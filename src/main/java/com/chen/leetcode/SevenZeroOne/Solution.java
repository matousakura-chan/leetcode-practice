package com.chen.leetcode.SevenZeroOne;

public class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length;
        int ind = (i + j) / 2;
        while (i != j && (j - i != 1)) {
            ind = (i + j) / 2;
            if (nums[ind] == target) return ind;
            if (nums[ind] < target) i = ind;
            else j = ind;
        }
        if (nums[i] == target) return i;
        if (nums[j] == target) return j;
        return -1;
    }
}
