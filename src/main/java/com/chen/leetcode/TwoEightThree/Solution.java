package com.chen.leetcode.TwoEightThree;

//移动到最前面后面填满0就可以

public class Solution {

    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        for (; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
