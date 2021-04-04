package com.chen.leetcode.FourEight;

public class Solution {

    public void rotate(int[][] matrix) {

        if(matrix.length==0) return;

        int size = matrix.length - 1;

        for (int i = 0; i <= size/2; i++) {
            for (int j = i; j < size - j; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[size-j][i];   //左下-左上
                matrix[size-j][i] = matrix[size-i][size-j];  //右下-左下
                matrix[size-i][size-j] = matrix[j][size-i];  //右上-右下
                matrix[j][size-i] = temp;   //左上-右上
            }
        }

    }
}
