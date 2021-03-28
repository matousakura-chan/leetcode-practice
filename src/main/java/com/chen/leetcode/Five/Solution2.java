package com.chen.leetcode.Five;

import java.util.HashMap;

public class Solution2 {
    public String longestPalindrome(String s) {

        if(s  == null) return null;

        char[] chars = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

        int res = 0,resI = 0,resJ = 0;

        for(int i = 0,j = 0;i<chars.length;i++){
            if(map.containsKey(chars[i])){
                j = map.get(chars[i]);
                if(i-j+1>res){
                    res  = i-j+1;
                    resI = i;
                    resJ = j;
                }
            }else
                map.put(chars[i],i);
        }
        return s.substring(resJ,resI+1);
    }
}
