package com.chen.leetcode.TwoEight;

import java.util.Arrays;

/**
 * KMP 算法
 */

public class Solution {

    public int strStr(String haystack, String needle) {

        if(haystack.isEmpty()||needle.isEmpty()) return -1;

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();

        //next数组创建
        int[] next = new int [n.length];
        for (int i = 0,j = 1;j<next.length;j++){
            if(n[j] == n[i]){
                next[j] = next[j - 1] + 1;
                i++;
            }
            else{
                while (n[j] != n[i]){
                    if(i == 0) break;
                    i = next[i-1];
                }
                if(n[i] == n[j]) next[j] = 1;
                else next[i] = 0;
            }
        }

        System.out.println(Arrays.toString(next));

        return -1;

    }
}
