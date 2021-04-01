package com.chen.leetcode.ThreeTwo;

import java.util.Stack;

public class Solution {

    public int longestValidParentheses(String s) {
        if(s.equals("")||s.length()<2) return 0;

        char[] chars = s.toCharArray();
        Stack<Integer> stack =  new Stack<>();

        int tempRes  = 0;
        int maxRes = 0;
        stack.push(-1); //peek表示有效子串开始的位置

        for(int i = 0;i<chars.length;i++){

            if(chars[i] == '(')
                stack.push(i);
            else if(chars[i] == ')'){
                int j = stack.pop();
                if(j>0&&chars[j] == '('){
                    tempRes = i - stack.peek();
                }else {
                    stack.push(i);
                }
            }
            maxRes = Math.max(maxRes,tempRes);
        }

        return maxRes;
    }
}
