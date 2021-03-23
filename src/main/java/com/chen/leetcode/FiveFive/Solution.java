package com.chen.leetcode.FiveFive;

public class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 0) return false;
        if (nums.length == 1) return true;
        if (nums[0] == 0) return false;          //特殊情况

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {                  //遇到零
                for (int j = i - 1; j >= 0; j--) {   //向前遍历
                    if (nums[j] > i - j) break;     //可以突破
                    if (j == 0 && i != nums.length - 1) return false;  //除掉特殊情况在末尾
                }
            }
        }
        return true;
    }
}
