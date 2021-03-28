package com.chen.leetcode.Three;

import sun.text.normalizer.UCharacter;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s==null) return 0;

        char[] chars = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

        int res = 0;

        for(int i = 0,j = 0;i<chars.length;i++){
            if(map.containsKey(chars[i])){
                j = map.get(chars[i]) + 1;
                map.clear();
                i = j;
            }
            map.put(chars[i],i);
            res = Math.max(i-j+1,res);
        }
        return res;
    }
}
