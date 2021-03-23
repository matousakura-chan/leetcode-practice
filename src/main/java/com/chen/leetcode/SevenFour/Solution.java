package com.chen.leetcode.SevenFour;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int i = 0;
        int j = matrix[0].length * matrix.length - 1;
        int m = i + (j - i) / 2;
        while (i < j) {
            m = i + (j - i) / 2;
            if (matrix[m / matrix[0].length][m % matrix[0].length] == target) return true;
            if (matrix[m / matrix[0].length][m % matrix[0].length] > target) {
                i = m;
            } else
                j = m;
        }
        if (matrix[i / matrix[0].length][i % matrix[0].length] == target) return true;
        if (matrix[j / matrix[0].length][j % matrix[0].length] == target) return true;
        return false;
    }
}
