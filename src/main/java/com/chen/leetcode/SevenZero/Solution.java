package com.chen.leetcode.SevenZero;

public class Solution {


    int [] floor  = null;
    public int climbStairs(int n) {

        if(n == 0) return -1;

        floor = new int[n];

        for(int i = 0;i<floor.length;i++){
            if(i == 0) floor[i] = 1;
            else if(i == 1) floor[i] = 2;
            else {
                floor[i] =  floor[i-1]+floor[i-2];
            }
        }
        return floor[n-1];
    }
}
