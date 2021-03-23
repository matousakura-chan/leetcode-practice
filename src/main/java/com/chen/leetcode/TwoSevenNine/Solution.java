package com.chen.leetcode.TwoSevenNine;

public class Solution {

    int nums[] = null;

    public int numSquares(int n) {
        if(n == 0) return -1;
        nums = new int[n+1];
        for(int i = 0;i<nums.length;i++){
            nums[i] = Integer.MAX_VALUE;
        }
        nums[0] =0;
        int maxSquareNum = 1;
        for(int i = 1;i<nums.length;i++){
            if(maxSquareNum*maxSquareNum==i) {
                nums[i] = 1;
                maxSquareNum++;  //找到最大的平方和加数
            }

            for(int squareNum = maxSquareNum-1;squareNum>0;squareNum--)
                nums[i] = Integer.min(nums[i],nums[i-squareNum*squareNum]+1);
        }

        return nums[n];
    }
}

