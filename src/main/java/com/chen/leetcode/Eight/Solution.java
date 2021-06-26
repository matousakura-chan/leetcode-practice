package com.chen.leetcode.Eight;

public class Solution {
    public int myAtoi(String s) {

        int res = 0;
        boolean isNegative = false;
        boolean isDecide = false;
        boolean isStart = false;
        char[] chars = s.toCharArray();
        for (char c:chars){
            if(c=='-'){
                if(!isDecide&&!isStart){
                    isNegative = true;
                    isDecide = true;
                    isStart = true;
                }else return res;
            }
            else if(c=='+'){
                if(!isDecide&&!isStart){
                    isDecide = true;
                    isStart = true;
                }else return res;
            }else if(c==' '){
                if(isStart)
                    return res;
            }
            else if(c<='z'&&c>='a'||c<='Z'&&c>='A'||c=='.'){
                return res;
            } else if(c<='9'&&c>='0'){
                isStart = true;
                if(!isNegative){
                    if(res>(Integer.MAX_VALUE-(c-'0'))/10)
                        return Integer.MAX_VALUE;
                    res = res*10+(c-'0');
                }else{
                    if(res<(Integer.MIN_VALUE+(c-'0'))/10)
                        return Integer.MIN_VALUE;
                    res = res*10-(c-'0');
                }
            }
        }
        return res;
    }
}