package com.chen.leetcode.TwoSeven;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        for (; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public int removeElement2(int[] nums, int val) {

        int i = 0, j = nums.length - 1;
        if (nums.length == 0) return 0;

        while (i < j) {
            while (i < j && nums[i] != val) i++;
            while (i < j && nums[j] == val) j--;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        if (nums[i] != val) return i++;
        return i;
    }
}