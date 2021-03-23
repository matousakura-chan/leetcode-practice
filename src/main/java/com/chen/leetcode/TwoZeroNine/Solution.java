package com.chen.leetcode.TwoZeroNine;

public
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        if (nums.length == 0) return -1;

        int res = 0, i = 0, j = 0, sum = nums[0];
        while (j < nums.length - 1) {
            if (sum < target) {
                sum += nums[++j];
            }
            while (sum >= target) {
                if (res == 0) res = j - i + 1;
                else res = res < (j - i + 1) ? res : (j - i + 1);
                sum -= nums[i++];
            }
        }
        return res;
    }
}
