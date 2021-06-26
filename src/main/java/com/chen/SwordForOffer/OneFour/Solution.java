package com.chen.SwordForOffer.OneFour;

public class Solution {
    public int cuttingRope(int n) {

        if(n == 2) return 1;
        if(n == 3) return 2;
        if(n == 4) return 4;

        return cutting(n);
    }

    private int cutting(int n){

        if(n == 2) return 2;
        if(n == 3) return 3;
        if(n == 4) return 4;

        return 3*cutting(n-3);
    }
}