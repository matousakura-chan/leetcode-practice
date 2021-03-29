package com.chen.leetcode.Five;


/**
 * dp[i][j] = (s[i]==s[j]) and (j-i<3 or dp[i+1][j-1])
 */

public class Solution2 {
    public String longestPalindrome(String s) {

        if(s  == null) return null;

        char[] chars = s.toCharArray();
        boolean [][] dp = new boolean[chars.length][chars.length];

        int resI = 0,resJ = 0,res = 0;

        for (int j = 0; j < chars.length; j++) {
            for (int i = 0; i <= j; i++) {
                dp[i][j] = chars[i]==chars[j]&&(j-i<3||dp[i+1][j-1]);
                if(dp[i][j]&&res<(j-i+1)){
                    res = (j-i+1);
                    resI = i;
                    resJ = j;
                }
            }
        }
        return s.substring(resI,resJ+1);
    }
}
