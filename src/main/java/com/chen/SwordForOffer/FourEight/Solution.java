package com.chen.SwordForOffer.FourEight;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()) return 0;
        HashMap<Character, Integer> seats = new HashMap<>();

        char[] chars = s.toCharArray();
        int maxGap = 1,gap = 0,lastGap = 0;
        for (int i = 0; i < chars.length; i++) {
            if(seats.containsKey(chars[i])){
                int temp = i - seats.get(chars[i]);
                gap = temp>lastGap?lastGap+1:temp;
            }
            else
                gap = lastGap+1;
            lastGap = gap;
            maxGap = Math.max(maxGap,gap);
            seats.put(chars[i],i);
        }
        return maxGap;
    }
}