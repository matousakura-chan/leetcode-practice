package com.chen.leetcode.TwoEightSeven;

public class Solution {

    //n+1数组含1到n个数找到重复 交换
    public int findDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            while (nums[i] != i + 1) {

                if (nums[i] == nums[nums[i] - 1])
                    return nums[i];

                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[nums[i] - 1] = temp;
            }
        }
        return -1;
    }
}

