package com.chen.leetcode.OneFourEightSix;

public class Solution {
    public int xorOperation(int n, int start) {

        return n==0?1:(start+2*n-2)^xorOperation(n - 1,start);

    }
}