package com.chen.leetcode.ThreeTwoTwo;

import java.util.ArrayList;

public class Solution {

    int[] count = null;
    public int coinChange(int[] coins, int amount) {

        if(amount == 0) return 0;
        count = new int[amount+1];
        count[0] = -1;

        for(int i = 1;i<=amount;i++){
            int tempMax = Integer.MAX_VALUE;
            for(int coin:coins){
                if(i == coin) tempMax = 1;  //相等就是自己本身
                if(i - coin > 0&&count[i - coin]!=-1)
                    tempMax = Math.min(count[i - coin]+1,tempMax); //遍历情况
            }
            count[i] = (tempMax == Integer.MAX_VALUE||tempMax == 0)?-1:tempMax;  //找不到就是无穷大 给-1
        }
        return count[amount];
    }

}

