package com.chen.SwordForOffer.SixSix;

import java.util.Arrays;

public class Solution {
    public int[] constructArr(int[] a) {
        int[] b = new int[a.length];
        if(a.length == 0||a.length == 1) return b;

        Arrays.fill(b,1);
        int temp = 1;
        for (int i = 1; i < a.length; i++) {
            temp*=a[i-1];
            b[i]*=temp;
        }
        temp = 1;
        for (int i = a.length-2; i >=0; i--) {
            temp*=a[i+1];
            b[i]*=temp;
        }
        return b;
    }
}