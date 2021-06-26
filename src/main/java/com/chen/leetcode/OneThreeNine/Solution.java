package com.chen.leetcode.OneThreeNine;

/**
 * 139. 单词拆分
 * 给定一个非空字符串 s 和一个包含非空单词的列表 wordDict，
 * 判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 * 2021.6.24 14:47
 */

import java.util.HashSet;
import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String> set = new HashSet<>();
        set.addAll(wordDict);

        boolean dp[] = new boolean[s.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}