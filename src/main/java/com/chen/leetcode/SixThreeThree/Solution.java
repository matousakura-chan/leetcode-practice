package com.chen.leetcode.SixThreeThree;

import java.util.HashSet;

public class Solution {

    public boolean judgeSquareSum(int c) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i<=Math.sqrt(c);i++){
            set.add(i*i);
        }

        for(Integer s:set){
            if(set.contains(c-s))
                return true;
        }
        return false;
    }
}