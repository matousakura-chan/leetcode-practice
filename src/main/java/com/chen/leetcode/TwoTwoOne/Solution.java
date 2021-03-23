package com.chen.leetcode.TwoTwoOne;

public class Solution {

    private int[] root = null;
    private int maxSquare = 0;

    public int maximalSquare(char[][] matrix) {

        int row = matrix.length;
        if(row == 0) return -1;
        int column = matrix[0].length;

        root = new int[row*column];
        for(int i = 0;i<root.length;i++){
            root[i] = i;
        }

        for(int i = 0;i<row;i++){
            for(int j = 0;i<column;j++){
                if(matrix[i][j] == '1'){

                }
            }
        }

    }



    public int find(int x){
        if(x == root[x]){
            return root[x];
        }
        return find(root[x]);
    }
    public void union(int x,int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX != rootY){
            root[rootX]=rootY;
        }
    }
}
