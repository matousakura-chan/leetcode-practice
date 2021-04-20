package com.chen.SwordForOffer.ThreeZero;

import java.util.Stack;

class MinStack {

    Stack<Integer> common = new Stack<>();
    Stack<Integer> min = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
        common.push(x);
        if(min.isEmpty())
            min.push(x);
        else min.push(Math.min(min.peek(),x));
    }

    public void pop() {
        common.pop();
        min.pop();
    }

    public int top() {
        return common.peek();
    }

    public int min() {
        return min.peek();
    }
}
