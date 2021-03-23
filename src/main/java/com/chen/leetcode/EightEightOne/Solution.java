package com.chen.leetcode.EightEightOne;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int res = 0;
        List<Integer> list = new ArrayList<>();
        for (int a : people) {
            if (a == limit) res++;
            else list.add(a);
        }
        list.sort((a, b) -> a - b);


        while (!list.isEmpty()) {
            int i = 0;
            int j = list.size() - 1;
            while (list.get(i) + list.get(j) > limit && (i != j)) {
                j--;
            }
            if (i != j) {
                list.remove(i);
                list.remove(j - 1);
            } else list.remove(i);
            res++;
        }
        return res;
    }
}
