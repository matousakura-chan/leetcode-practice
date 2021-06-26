package com.chen.leetcode.OneTwo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class Solution {

    public String intToRoman(int num) {

        StringBuilder roman = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");

        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        set.addAll(map.keySet());

        for (Integer integer : set) {
            while (num >= integer){
                roman.append(map.get(integer));
                num-=integer;
            }
        }
        return roman.toString();
    }

}
