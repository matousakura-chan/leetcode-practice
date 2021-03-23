package com.chen.leetcode.OneTwoOneSeven;

public class Solution {



    public int minCostToMoveChips(int[] position) {

        int i = 0,j = 0;
        for(int p:position){
            if(p/2 == 0) i+=1;
            else j+=1;
        }
        return i>j?j:i;
    }
}
