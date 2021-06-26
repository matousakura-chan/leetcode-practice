package com.chen.leetcode.OneSevenFourFour;

import java.util.Arrays;
/**
 *
 * 从第 0 天开始吃糖果。因此对于第 i 个询问
 * ，我们可以吃 i + 1 天的糖果。
 *
 */
class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {

        boolean[] res = new boolean[queries.length];
        //前缀和
        long[] countTree = new long[candiesCount.length];
        long temp = 0;
        for (int i = 0; i < countTree.length; i++) {
            temp += candiesCount[i];
            countTree[i] = temp;
        }
        Arrays.fill(res,false);
        for (int i = 0; i < queries.length; i++) {
            //二分法
            long cap = queries[i][2];
            int type = queries[i][0];
            long day = queries[i][1] + 1;
            //每天吃一个
            //每天吃最多
            if(type==0)
                res[i] = day<=countTree[type];
            else
                //每天吃一个还不够吃且每天吃最多够吃
                res[i] = day<=countTree[type]&&day>countTree[type-1]/cap;
        }
        return res;
    }
}
