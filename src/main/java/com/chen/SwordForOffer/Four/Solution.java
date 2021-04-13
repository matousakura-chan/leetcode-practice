package com.chen.SwordForOffer.Four;

/**
 * 时间复杂度要缩小到 O(M+N)
 */
public class Solution {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row =  matrix.length;
        if(row == 0) return false;
        int column = matrix[0].length;
        int i = 0,j = column-1;
        while (i<row&&j>=0){
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }
}
