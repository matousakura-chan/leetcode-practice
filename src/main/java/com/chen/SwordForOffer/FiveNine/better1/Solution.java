package com.chen.SwordForOffer.FiveNine.better1;

import java.util.Deque;
import java.util.LinkedList;


public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int [] res = {};
        if(k>nums.length||nums.length==0) return res;

        res = new int[nums.length-k+1];

        Deque<Integer> deque = new LinkedList<>();

        //单调队列
        for(int i = 0;i<k;i++){
            while (!deque.isEmpty()&&nums[i]>nums[deque.getLast()])
                deque.removeLast();
            deque.add(i);
        }
        res[0] = nums[deque.getFirst()];

        for (int i = k,j = 1;i<nums.length;i++){
            if(deque.getFirst() == i-k) deque.removeFirst();
            while (!deque.isEmpty()&&nums[i]>nums[deque.getLast()]) deque.removeLast();
                deque.add(i);
            res[j++] = nums[deque.getFirst()];
        }
        return res;
    }
}
