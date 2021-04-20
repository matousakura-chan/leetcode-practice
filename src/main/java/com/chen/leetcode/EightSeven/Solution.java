package com.chen.leetcode.EightSeven;

public class Solution {

    public boolean isScramble(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }

        int[] letters = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i) - 'a']++;
            letters[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }

        int length = s1.length();
        boolean[][][] dp = new boolean[length][length][length + 1];
        //遍历所有的字符串长度
        for (int len = 1; len <= length; len++) {
            //S1 开始的地方
            for (int i = 0; i + len <= length; i++) {
                //S2 开始的地方
                for (int j = 0; j + len <= length; j++) {
                    //长度是 1 无需切割
                    if (len == 1) {
                        dp[i][j][len] = s1.charAt(i) == s2.charAt(j);
                    } else {
                        //遍历切割后的左半部分长度
                        for (int q = 1; q < len; q++) {
                            dp[i][j][len] = dp[i][j][q] && dp[i + q][j + q][len - q]
                                    || dp[i][j + len - q][q] && dp[i + q][j][len - q];
                            //如果当前是 true 就 break，防止被覆盖为 false
                            if (dp[i][j][len]) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return dp[0][0][length];
    }
}
