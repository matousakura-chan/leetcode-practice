package com.chen.leetcode.OneZeroOneOne.binary;

public class Solution {
    public int shipWithinDays(int[] weights, int D) {

        int min = Integer.MIN_VALUE,max = 0;
        for (int w:weights){
            min = Math.max(w,min);
            max += w;
        }

        while (min<max){
            int volume = (min+max)/2;
            int need = 0;
            for (int weight : weights) {
                if (volume - weight < 0) {
                    volume = (min+max)/2;
                    need++;
                }
                volume -= weight;
            }
            if(need >= D) min =  (min+max)/2+1;
            else max =  (min+max)/2;
        }

        return min;
    }
}