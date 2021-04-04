package com.chen.leetcode.FourNine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution {

    HashMap<Integer,List<String>> map = new HashMap<>();

    public List<List<String>> groupAnagrams(String[] strs) {

        for (String s:strs){
            int num = 0;
            char[] chars = s.toCharArray();
            for (char c:chars){
                num += (c-1)*(c+1)*(-c)*(c+c<<2)*c<<1;
            }
            if(!map.containsKey(num)){
                map.put(num,new ArrayList<>());
            }else {
                map.get(num).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
