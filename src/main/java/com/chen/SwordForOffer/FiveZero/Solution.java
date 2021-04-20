package com.chen.SwordForOffer.FiveZero;

import java.util.BitSet;

public class Solution {

    public char firstUniqChar(String s) {

        char res = ' ';

        if(s.length()==0) return res;

        BitSet h = new BitSet(128);
        BitSet d = new BitSet(128);

        char[] chars = s.toCharArray();
        for (char c:chars){
            if(!h.get(c)&&!d.get(c))
                d.set(c);
            else
                h.set(c);
        }

        for (char c : chars) {
            if (d.get(c) && !h.get(c))
                return c;
        }
        return res;
    }
}
