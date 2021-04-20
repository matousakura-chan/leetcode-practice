package com.chen.SwordForOffer.FiveNine;


import java.util.PriorityQueue;


public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int [] res = {};
        if(k>nums.length) return res;

        res = new int[nums.length-k+1];
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b)->b-a);

        for(int i = 0 ,j = 0;i<nums.length;i++){
            if(i<k-1)
                queue.add(nums[i]);
            else  if(i==k-1){
                queue.add(nums[i]);
                res[j++] = queue.peek();
            }else {
                queue.remove(nums[i-k]);
                queue.add(nums[i]);
                res[j++] = queue.peek();
            }
        }
        return res;
    }
}
