package com.chen.leetcode.TwoEight;

import java.util.Arrays;

/**
 * KMP 算法
 */

public class Solution {

    public int strStr(String haystack, String needle) {

        if(haystack.isEmpty()&&needle.isEmpty()) return 0;
        if(haystack.isEmpty()) return -1;
        if(needle.isEmpty()) return 0;

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();

        //next数组创建
        int[] next = new int [n.length];
        for (int i = 0,j = 1; j < n.length; j++) {
            while (i>0&&n[i] != n[j]){
                i = next[i - 1];
            }
            if (n[i] == n[j]) i++;
            //dp next数组
            next[j] = i;
        }
        System.out.println(Arrays.toString(next));

        for (int i = 0,j = 0;i< h.length;i++){
            System.out.println("OUT:"+i+h[i]+"-----"+j+n[j]);
            while (j>0&&h[i] != n[j]){
                j = next[j - 1];
            }
            if (h[i] == n[j]) j++;
            if(j == next.length)
                return i + 1 - n.length;
        }
        return -1;
    }
}