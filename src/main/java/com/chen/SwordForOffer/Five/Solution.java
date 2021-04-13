package com.chen.SwordForOffer.Five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */

public class Solution {

    public String replaceSpace(String s) {

        int count = 0;
        char[] chars = s.toCharArray();
        for (char c:chars)
            if(c == ' ') count++;
        char[] res = new char[count*2+chars.length];
        System.arraycopy(chars, 0, res, 0, chars.length);

        int i = res.length-1,j = chars.length;
        while (j != i&&j>0){
            if(res[--j] == ' '){
                res[i--] = '0';
                res[i--] = '2';
                res[i--] = '%';
            }else {
                res[i--] = res[j];
            }
        }
        return String.valueOf(res);
    }
}
