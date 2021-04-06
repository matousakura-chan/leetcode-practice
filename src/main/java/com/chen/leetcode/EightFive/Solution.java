package com.chen.leetcode.EightFive;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public int maximalRectangle(char[][] matrix) {

        int row = matrix.length;
        if(row == 0) return 0;
        int column = matrix[0].length;

        int [][] area = new int [row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j] == '1')
                    area[i][j] = i>0?(area[i-1][j]+1):1;
            }
        }

        for (int []a:area){
            System.out.println(Arrays.toString(a));
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int maxArea = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                while (stack.peek()!=-1&&area[i][j]<area[i][stack.peek()]){
                    int a = stack.pop();
                    int length = j - stack.peek() -1;
                    maxArea = Math.max(maxArea,area[i][a]*length);
                }
                stack.push(j);
            }

            while (stack.size()!=1){
                int a = stack.pop();
                int length = column - stack.peek() -1;
                maxArea = Math.max(maxArea,area[i][a]*length);
            }
        }
        return maxArea;
    }
}
