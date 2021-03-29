package com.chen.leetcode.OneSeven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    List<String> list = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();
    HashMap<String, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        if(digits.equals("")) return list;

        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");

        backtracking(digits);
        return list;
    }
    public void backtracking(String digits){

        if(digits.equals("")) {
            list.add(new String(stringBuilder));
            return;
        }

        char[] chars = map.get(digits.substring(0, 1)).toCharArray();

        for(char c:chars){
            stringBuilder.append(c);
            backtracking(digits.substring(1));
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
