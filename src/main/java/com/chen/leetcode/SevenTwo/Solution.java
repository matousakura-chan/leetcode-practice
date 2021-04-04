package com.chen.leetcode.SevenTwo;

import java.util.Arrays;

/**
 * 最小子列
 * 字母之差
 * 子列之差
 */

public class Solution {
    public int minDistance(String word1, String word2) {

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int n1 = w1.length;
        int n2 = w2.length;

        if(n1 == 0) return w2.length;  //添加全部
        if(n2 == 0) return w1.length;  //删除全部

        int dp[][] = new int [n1+1][n2+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                int min = Math.min(dp[i-1][j-1],(Math.min(dp[i][j-1],dp[i-1][j])));

                if(w1[i-1] != w2[j-1])
                    dp[i][j] = min + 1;
                else
                    dp[i][j] = dp[i-1][j-1];
            }
        }
        for (int []a:dp){
            System.out.println(Arrays.toString(a));
        }
        return dp[n1][n2];
    }

}
