package com.chen.SwordForOffer.FiveSeven.two;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] findContinuousSequence(int target) {

        int [][] res = {};
        List<int[]> list = new ArrayList<>();

        if(target<0) return res;

        int sum = 0;

        for (int i = 1,j = 1;j<target;j++){

            sum +=j;
            while (sum>target){
                sum -= i++;
            }
            if(sum == target){
                int[] sub = new int[j - i + 1];
                 for (int a = i;a<=j;a++){
                    sub[a - i]  = a;
                }
                list.add(sub);
            }
        }
        res = new int [list.size()][];
        int count = 0;
        for (int[] sub:list){
            res[count++] = sub;
        }
        return res;
    }
}
