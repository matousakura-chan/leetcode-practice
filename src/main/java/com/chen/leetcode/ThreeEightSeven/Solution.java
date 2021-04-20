package com.chen.leetcode.ThreeEightSeven;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int firstUniqChar(String s) {

        int[] cnts = new int[128];
        Queue<Integer> queue = new LinkedList<>();

        char[] chars = s.toCharArray();
        int [] count = new int [128];
        for (int i = 0;i<chars.length;i++) {
            count[chars[i]]++;
            queue.add(i);
            while (!queue.isEmpty() && count[chars[queue.peek()]] > 1)
                queue.poll();
        }

        return queue.isEmpty()?-1:queue.poll();
    }
}
