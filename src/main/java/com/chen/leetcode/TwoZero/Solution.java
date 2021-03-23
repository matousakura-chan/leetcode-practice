package com.chen.leetcode.TwoZero;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {

        if (s.length() % 2 == 1) {
            return false;
        }

        boolean res = true;
        int ind = 0;
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        while (ind < s.length()) {
            if (c[ind] == '(' || c[ind] == '[' || c[ind] == '{')
                stack.push(c[ind]);
            else {
                if (stack.empty()) return false;
                if (c[ind] == ')')
                    res = (stack.pop() == '(');
                if (c[ind] == '}')
                    res = (stack.pop() == '{');
                if (c[ind] == ']')
                    res = (stack.pop() == '[');
                if (res == false) return false;
            }
            ind++;
        }
        if (stack.size() > 0) return false;
        return res;
    }
}
