package com.chen.leetcode.OneTwoOne;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxBenefit = Integer.MIN_VALUE;
        for(int p:prices){
            minPrice = Integer.min(p,minPrice);
            maxBenefit = Integer.max(p-minPrice,maxBenefit);
        }
        return maxBenefit;
    }
}
