package com.chen.leetcode.ThreeSixThree;

import com.chen.leetcode.ThreeZeroFour.NumMatrix;

import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {

    int[][] sum = null;

    public int maxSumSubmatrix(int[][] matrix, int k) {

        int max = Integer.MIN_VALUE;
        NumMatrix(matrix);
        if(sum == null) return -1;

        for (int top = 0; top < matrix.length; top++){
            for (int but = top; but < matrix.length; but++) {
                TreeSet<Integer> set = new TreeSet<Integer>();
                set.add(0);
                for (int i = 0;i < matrix[0].length;i++){

                    int area = sumRegion(top,0,but,i);
                    Integer ceiling = set.ceiling(area-k);
                    if(ceiling!=null)
                        max = Math.max(max,area-ceiling);
                    set.add(area);
                }
            }
        }
        return max;
    }

    public void NumMatrix(int[][] matrix) {
        if(matrix.length == 0) return;
        sum = new int [matrix.length+1][matrix[0].length+1];
        for (int i = 0; i <= matrix.length; i++) {
            sum[i][0] = 0;
        }
        for (int i = 0; i <= matrix[0].length; i++) {
            sum[0][i] = 0;
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                sum[i+1][j+1] = sum[i+1][j]+sum[i][j+1]-sum[i][j]+matrix[i][j];
            }
        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(sum == null) return -1;
        return sum[row2+1][col2+1]-sum[row2+1][col1]-sum[row1][col2+1]+sum[row1][col1];
    }
}