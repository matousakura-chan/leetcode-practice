package com.chen.SwordForOffer.SixThree;

public class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice,price);
            profit = Math.max(price - minPrice,profit);
        }
        return profit;

    }
}