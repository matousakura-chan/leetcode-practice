package com.chen.leetcode.TwoThreeNine;

import java.util.*;


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        //大顶堆
        PriorityQueue<int[]> heap = new PriorityQueue<>(k, (o1, o2) -> o2[0] != o1[0] ? o2[0] - o1[0] : o2[1] - o1[1]);


        int[] res = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            heap.offer(new int[]{nums[i], i});
            if (i >= k - 1) {
                res[i - k + 1] = heap.peek()[0];
                //1会空指针异常
                while (!heap.isEmpty()&&heap.peek()[1] < i - k + 1) {
                    heap.poll();
                }
            }
        }
        return res;
    }
}


//public class Solution {
//
//    public int[] maxSlidingWindow(int[] nums, int k) {
//
//        List<Integer> list = new ArrayList<>();
//
//        if (k == 1) {
//            int max = Integer.MIN_VALUE;
//            for (int num : nums) {
//                max = Math.max(num, max);
//                list.add(max);
//            }
//            int[] res = new int[list.size()];
//            for (int i = 0; i < res.length; i++) {
//                res[i] = list.get(i);
//            }
//            return res;
//        }
//
//        int l = 0, r = 0;
//        int max = 0;
//        for (; r < k; r++) {
//            max += nums[r];
//        }
//        list.add(max);
//        int curr = max;
//        l++;
//        r++;
//        for (; r < nums.length; r++) {
//            curr = curr + nums[r] - nums[l];
//            max = Math.max(max, curr);
//            list.add(max);
//        }
//        int[] res = new int[list.size()];
//        for (int i = 0; i < res.length; i++) {
//            res[i] = list.get(i);
//        }
//        return res;
//    }
//}
