package com.chen.SwordForOffer.FourZero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

    public int[] getLeastNumbers(int[] arr, int k) {

        //大顶堆
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i = 0; i < arr.length; i++) {
            if(queue.size()<k)
                queue.offer(arr [i]);
            else
                if(!queue.isEmpty()&&queue.peek()>arr[i]){
                    queue.remove();
                    queue.offer(arr[i]);
                }
        }
        return new ArrayList<>(queue).stream().mapToInt(Integer::valueOf).toArray();
    }
}
