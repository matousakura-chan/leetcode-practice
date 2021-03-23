package com.chen.leetcode.TwoTwo;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<String> resList = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        StringBuffer s = new StringBuffer();
        generate(n, n, s);
        return resList;
    }

    public void generate(int r, int l, StringBuffer s) {
        if (r == 0 && l == 0) {
            resList.add(s.toString());
            return;
        }
        if (l > r) return; //
        if (l > 0) {
            s.append('(');
            generate(r, l - 1, s);
            s.deleteCharAt(s.length() - 1);
        }
        if (r > 0) {
            s.append(')');
            generate(r - 1, l, s);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
