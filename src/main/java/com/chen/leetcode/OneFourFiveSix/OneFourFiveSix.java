package com.chen.leetcode.OneFourFiveSix;

public class OneFourFiveSix {

    public int maxVowels(String s, int k) {
        int i = 0, j = k - 1, num = 0, res = 0;
        for (int a = 0; a <= k - 1; a++) {
            char c = s.charAt(a);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                num++;
            }
        }
        res = num;

        for (; j < s.length() - 1; ) {
            char next = s.charAt(++j);
            if (next == 'a' || next == 'e' || next == 'i' || next == 'o' || next == 'u') {
                num++;
            }
            char prev = s.charAt(i++);
            if (prev == 'a' || prev == 'e' || prev == 'i' || prev == 'o' || prev == 'u') {
                num--;
            }
            if (res == 0) res = num;
            else res = res > num ? res : num;
        }
        return res;
    }


}
