package com.chen.leetcode.SevenNine;

import java.util.Arrays;

public class Solution2 {

    boolean[][] flag;
    char[][] b;
    char[] c;
    int row;
    int column;
    boolean result;


    public boolean exist(char[][] board, String word) {

        c = word.toCharArray();
        if(c.length == 0) return false;

        row = board.length;
        if(row == 0) return false;
        column = board[0].length;
        b = board;

        flag = new boolean[row][column];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == c[0]){
                    search(i,j,0);
                }
                if(result) return true;
            }
        }
        return false;
    }

    private void search(int i,int j,int begin){

        if(flag[i][j]||b[i][j] != c[begin]) return;

        flag[i][j] = true;

        if(begin+1 == c.length) {
            result = true;
            return;
        }


        if(i-1>0) search(i-1,j,begin+1);
        if(j-1>0)  search(i,j-1,begin+1);
        if(i+1<row) search(i+1,j,begin+1);
        if(j+1<column)  search(i,j+1,begin+1);

        flag[i][j] = false;
    }
}
