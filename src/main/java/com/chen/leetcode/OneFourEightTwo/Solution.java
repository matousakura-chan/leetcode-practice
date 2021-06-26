package com.chen.leetcode.OneFourEightTwo;

public class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if(m*k > bloomDay.length) return -1;

        int l = Integer.MAX_VALUE,r = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            l = Math.min(l,day);
            r = Math.max(r,day);
        }

        int mid = (l+r)>>1;

        while (l<r){
            int numBloom = 0,numMake = 0;
            for (int day : bloomDay) {
                if(day<=mid) numBloom++;
                else numBloom = 0;
                if(numBloom == k){
                    numMake ++;
                    numBloom-=k;
                }
            }
            if(numMake<m) l = mid+1;
            else r = mid;
        }
        return l;
    }
}
