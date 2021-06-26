package com.chen.SwordForOffer.ThreeEight;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 设置一个标志位表示这个字母本身已经被使用过了
 * 接下来就是重复字母的问题
 */
public class Solution {

    ArrayList<String> list = new ArrayList<>();
    public String[] permutation(String s) {

        if(s.isEmpty())
            return list.toArray(new String[0]);

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        backtracking(chars,new boolean[chars.length],new StringBuilder());

        return list.toArray(new String[list.size()]);
    }

    private void backtracking(char[] chars,boolean[] flag,StringBuilder s){
        if(s.length() == chars.length){
            list.add(s.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {

            //精髓！！！！！
            if(flag[i]||i != 0 && chars[i] == chars[i - 1] && !flag[i - 1])
                continue;
            flag[i] = true;
            s.append(chars[i]);
            backtracking(chars,flag,s);
            flag[i] = false;
            s.deleteCharAt(s.length()-1);
        }
    }
}