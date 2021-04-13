package com.chen.leetcode.TwoSixThree;

public class Solution {

    boolean flag = false;
    int [] base = {2,3,5};

    public boolean isUgly(int n) {
        if(n == 0) return false;
        if(n == 1) return true;
        search(n);
        return flag;
    }

    private void search(int n){
        if(n == 1){
            flag = true;
            return;
        }
        for (int i = 0; i < base.length; i++) {
            if(n%base[i]==0)
                search(n/base[i]);
        }
    }
}
