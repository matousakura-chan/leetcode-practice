package com.chen.leetcode.OneTwoSixNine;

/**
 * 对于计算方案数的题目，常用的方法是动态规划。
 */
public class Solution {
    public int numWays(int steps, int arrLen) {
        final int MODULO = 1000000007;
        int maxColumn = Math.min(arrLen - 1, steps);
        int[][] dp = new int[steps + 1][maxColumn + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= steps; i++) {
            for (int j = 0; j <= maxColumn; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j - 1 >= 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MODULO;
                }
                if (j + 1 <= maxColumn) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % MODULO;
                }
            }
        }
        return dp[steps][0];
    }
}
class DFS {

    private static int []next = {0,-1,1};
    private int count = 0;

    public int numWays(int steps, int arrLen) {

        backtracking(0,steps,arrLen);
        return count%(1000000007);
    }

    private void backtracking(int now,int steps,int arrLen){
        if(now == -1||now == arrLen||now>steps) return;
        if(steps == 0){
            if(now==0){
                count++;
            }
            return;
        }
        for (int j : next) {
            backtracking(now + j, steps - 1, arrLen);
        }
    }
}
