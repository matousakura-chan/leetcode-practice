package com.chen.leetcode.OneThreeOneZero;

public class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        int [] nums = new int [arr.length];
        nums[0] = arr[0];
        for (int i = 1; i < nums.length; i++)
            nums[i] = nums[i-1]^arr[i];

        int []res = new int [queries.length];
        for (int i = 0; i < queries.length; i++)
            res[i] = queries[i][0] == 0?nums[queries[i][1]]:
                    nums[queries[i][1]]^(nums[queries[i][0]-1]);
        return res;

    }
}