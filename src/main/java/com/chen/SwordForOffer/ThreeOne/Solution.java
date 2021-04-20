package com.chen.SwordForOffer.ThreeOne;

import java.util.Stack;

public class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length == 0&&popped.length == 0) return true;
        if(pushed.length == 0||popped.length == 0) return false;

        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0 ,j = 0;i<pushed.length;i++){

            stack.push(pushed[i]);
            while (!stack.isEmpty()&&stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
