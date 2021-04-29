package com.chen.leetcode.OneZeroOneOne;

public class Solution {
    public int shipWithinDays(int[] weights, int D) {

        int max = Integer.MIN_VALUE;
        for (int w:weights){
            max = Math.max(w,max);
        }

        int volume = max;
        int remain = D;
        int i = 0;
        for (; i < weights.length; i++) {
            if (volume - weights[i] < 0) {
                volume = max;
                remain--;
            }
            volume -= weights[i];
            if(remain == -1){
                i = -1;
                max++;
                volume = max;
                remain = D;
            }
        }
        return max;
    }
}