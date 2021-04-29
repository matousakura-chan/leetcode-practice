package com.chen.leetcode.NineOne;

/**
 * dp 动态规划
 */

public class Solution {
    public int numDecodings(String s) {

        if(s.isEmpty()) return 0;
        char[] array = s.toCharArray();
        if(array[0] == '0') return 0;
        int [] dp = new int [array.length];
        dp[0] = 1;

        for (int i = 1; i < array.length; i++) {

            int a = array[i] - '0';
            int b = array[i] - '0'+(array[i-1] - '0')*10;
            if(a<=9 && a>0)
                dp[i] = dp[i-1];
            if(b<=26 && b>=10){
                if(i>1)
                    dp[i] += dp[i-2];
                else
                    dp[i] += 1;
            }
        }
        return dp[array.length-1];
    }
}