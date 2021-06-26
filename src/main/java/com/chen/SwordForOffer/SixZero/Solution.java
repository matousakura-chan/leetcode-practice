package com.chen.SwordForOffer.SixZero;

import java.util.Arrays;

/**
 * [n,6n] 的可能，数量为 6n - n + 1 = 5n + 1 种。
 *
 * f(n,x) = ∑ f(n-1,x-i) * 1/6
 * 即最后一个的 1 ~ 6 情况去对应前 x - 1 ~ x - 6 的情况
 */

public class Solution {

    public double[] dicesProbability(int n) {

        double[] dp = new double [6];
        Arrays.fill(dp,1/6);

        for (int i = 2; i <= n; i++) {
            double[] temp = new double [5*i + 1];
            for (int j = 0; j < dp.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j+k] += dp[j]/6;
                }
            }
            dp = temp;
        }
        return dp;
    }
}
