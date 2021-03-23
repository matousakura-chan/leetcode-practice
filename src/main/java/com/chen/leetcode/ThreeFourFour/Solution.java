package com.chen.leetcode.ThreeFourFour;

public class Solution {

    public void reverseString(char[] s) {

        if (s.length == 0) return;
        reverse(s, 0);

    }

    public void reverse(char[] s, int star) {

        if (s.length - 1 == star) return;

        reverse(s, star + 1);

        char head = s[star];
        for (int a = star; a < s.length - 1; a++) {
            s[a] = s[a + 1];
        }
        s[s.length - 1] = head;
    }
}
