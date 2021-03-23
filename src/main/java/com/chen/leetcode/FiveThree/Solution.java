package com.chen.leetcode.FiveThree;

public class Solution {

    public int maxSubArray(int[] nums) {

        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];

        int res = maxSub(nums, 0, nums.length - 1);

        return res;
    }

    int maxSub(int[] nums, int star, int end) {

        if (star == end) return nums[star];

        int mid = (star + end) / 2;
        int lMax = maxSub(nums, star, mid);
        int rMax = maxSub(nums, mid + 1, end);

        int lSubMax = nums[mid], rSubMax = nums[mid + 1], subStar = mid, subEnd = mid + 1;
        int temp = 0;
        while (subStar >= star) {  //求左边最大
            temp += nums[subStar--];
            lSubMax = temp > lSubMax ? temp : lSubMax;
        }
        temp = 0;
        while (subEnd <= end) {   //求右边最大
            temp += nums[subEnd++];
            rSubMax = temp > rSubMax ? temp : rSubMax;
        }
        int mMax = lSubMax + rSubMax > (lSubMax > rSubMax ? lSubMax : rSubMax) ? lSubMax + rSubMax : (lSubMax > rSubMax ? lSubMax : rSubMax);

        return rMax > (mMax > lMax ? mMax : lMax) ? rMax : (mMax > lMax ? mMax : lMax);
    }
}
