package com.chen.leetcode.OneTwoSevenSeven;

public class Solution {

    int [] nums;
    int res = 0;

    public int countSquares(int[][] matrix) {

        if(matrix == null) return -1;
        int row = matrix.length;
        if(row == 0) return -1;
        int column = matrix[0].length;

        nums = new int[row*column];

        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                if(matrix[i][j] == 1){
                        if(i == 0||j == 0) nums[i*column+j] =1;
                    else
                        nums[i*column+j] = Math.min(Math.min(nums[i*column+j-1],nums[(i-1)*column+j]),nums[(i-1)*column+j-1])+1;
                }
                res = Math.max(nums[i*column+j]*nums[i*column+j],res);
            }
        }
        return res;
    }
}


