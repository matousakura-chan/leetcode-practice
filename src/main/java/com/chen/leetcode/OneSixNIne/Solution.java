package com.chen.leetcode.OneSixNIne;

class Solution {
    public int majorityElement(int[] nums) {

        if (nums.length == 0) return -1;

        int res = 0;
        int count = 0;
        res = nums[0];

        for (int num : nums) {
            if (count == 0) res = num;
            if (res == num) count++;
            else count--;

            //count += (num == res) ? 1 : -1;
        }
        return res;

    }
}