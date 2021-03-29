package com.chen.leetcode.OneZero;


/**
 * 大子串是否匹配，和剩余子串是否匹配，是规模不一样的同一问题
 * 动态规划！！！
 *
 * dp[i][j] = dp[i + 1][j + 1]
 */
public class Solution {

    public boolean isMatch(String s, String p) {

        char[] sc = s.toCharArray();
        char[] pc = p.toCharArray();

        boolean dp[][] = new boolean[pc.length+1][sc.length+1];


        //处理空字符串，空字符串只能匹配空字符串
        dp[0][0] = true;
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = false;
        }
        for (int i = 1; i < dp.length; i++) {
            if(pc[i-1] == '*')   dp[i][0] = dp[i-2][0];
            else dp[i][0] = false;
        }

        //循环 模式串为大循环 模式串匹配完结束
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1;j < dp[0].length; j++) {

                //出现*号有多种情况
                //dp[i-2][j]   *号前面没有出现 考察*前匹配j情况
                //dp[i-2][j-1] *号前面出现一次 考察*前匹配j-1情况
                //dp[i][j-1]   *号前面出现多次

                /**
                 * 考虑 '.' 的情况！！！！！！！！！！！！！
                 */

                if(pc[i-1] == '*'){
                    //前面的字母匹配或前面是个 '.'
                    if(pc[i-2] == sc[j-1]||pc[i-2]=='.')
                        dp[i][j] = dp[i-2][j]||dp[i-2][j-1]||dp[i][j-1];
                    //前面的字母不匹配 *号前面没有出现
                    else
                        dp[i][j] = dp[i-2][j];
                }
                //这一位匹配了也要看前面有没有匹配
                else if(pc[i-1] == '.'||pc[i-1] == sc[j-1]){
                    dp[i][j] = dp[i-1][j-1];
                }else
                    dp[i][j] = false;
            }
        }
        //放回最右下脚
        return dp[dp.length-1][dp[0].length-1];
    }
}
