package com.chen.leetcode.TwoThreeEight;

import java.util.Arrays;

public class Solution {

//前缀之积 正向反向遍历

    public int[] productExceptSelf(int[] nums) {

        int total = 1;
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = total;
            total *= nums[i];
        }

        total = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= total;
            total *= nums[i];
        }
        return res;
    }


//    //前缀树
//    public int[] productExceptSelf(int[] nums) {
//
//        int prevSum = 1;
//        for (int num : nums) {
//            num *= num;
//            prevSum = num;
//        }
//
//        int[] res = new int[nums.length];
//        Arrays.fill(res, 1);
//
//        for (int i = 0; i < nums.length; i++) {
////            res[i] = nums[nums.length-i]
//        }


}
