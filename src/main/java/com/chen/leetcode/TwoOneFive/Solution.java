package com.chen.leetcode.TwoOneFive;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue(Collections.reverseOrder());
        for (int num : nums) {
            queue.add(num);
        }
        for (int i = 1; i < k; i++) {
            queue.poll();
        }
        return queue.peek();
    }
}