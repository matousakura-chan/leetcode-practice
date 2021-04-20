package com.chen.SwordForOffer.TwoNine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    int [] a = {};

    public int[] spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int row = matrix.length;
        if(row== 0) return a;
        int column = matrix[0].length;

        a  = new int [row*column];

        int r1 = 0, r2 = 0, r3 = column-1,r4 = row-1;
        int index = 0;

        //(r1,r2)(r1,r3)
        //(r4,r2)(r4,r3)

        while (r1 <= r4&&r2 <= r3){
            for (int i = r2; i<=r3 ; i++){
                a[index++] = matrix[r1][i];
            }
            for (int i = r1+1; i<=r4 ; i++){
                a[index++] = matrix[i][r3];
            }
            if(r1!=r4)
            for (int i = r3-1; i>=r2 ; i--){
                a[index++] = matrix[r4][i];
            }
            if(r2!=r3)
            for (int i = r4-1; i>r1 ; i--){
                a[index++] = matrix[i][r2];
            }
            r1++;r2++;r3--;r4--;
        }

        return a;
    }
}
