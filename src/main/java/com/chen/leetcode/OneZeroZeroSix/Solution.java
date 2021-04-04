package com.chen.leetcode.OneZeroZeroSix;

import java.util.Stack;

public class Solution {

    public int clumsy(int N) {

        Stack<Integer> stack = new Stack<>();
        //11 +  12 -  13 *  14 /

        int temp = 0;
        int res = 0;
        stack.push(N--);
        while (N>0){
            switch ((temp++)%4){
                case 0:stack.push((N--)*stack.pop()); break;
                case 1:stack.push(stack.pop()/(N--)); break;
                case 2:
                case 3:stack.push((N--)); break;
            }
        }
        while (stack.size()>1){
            if(stack.size()%2 == 0) res += stack.pop();
            else res -= stack.pop();
        }
        return res + stack.pop();
    }
}
