package com.chen.leetcode.ThreeEightNine;

public class Solution {
    public char findTheDifference(String s, String t) {

        if ("".equals(s)) return t.charAt(0);

        int snum = 0;
        int tnum = 0;

        for (char a : s.toCharArray()) {
            snum += a;
        }

        for (char a : t.toCharArray()) {
            tnum += a;
        }

        return (char) (tnum - snum);
    }
}
