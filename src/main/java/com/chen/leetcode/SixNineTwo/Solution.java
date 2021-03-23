package com.chen.leetcode.SixNineTwo;

import java.util.*;

public class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        int num = 0;
        for (String word : words) {
            if (!map.containsKey(word))
                map.put(word, 1);
            else {
                int i = map.get(word);
                map.put(word, i + 1);
            }
        }

        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(
                (en1, en2) -> {
                    if (en1.getValue() != en2.getValue()) return en2.getValue() - en1.getValue();
                    else return en1.getKey().compareTo(en2.getKey());
                }
        );
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            queue.add(entry);
        }

        List<String> list = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            list.add(queue.poll().getKey());
        }

        return list;
    }
}
