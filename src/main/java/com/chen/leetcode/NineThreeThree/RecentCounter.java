package com.chen.leetcode.NineThreeThree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RecentCounter {

    Queue<Integer> queue = null;


    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        int res = queue.size();
        while (queue.peek() != null && queue.peek() < (t - 3000)) {
            res--;
            queue.poll();
        }
        return res;
    }
}
