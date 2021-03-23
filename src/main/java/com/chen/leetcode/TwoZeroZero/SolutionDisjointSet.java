package com.chen.leetcode.TwoZeroZero;

import java.util.ArrayList;
import java.util.List;

public class SolutionDisjointSet {


    private int[] root = null;
    private int uniCount = 0;
    private int count = 0;

    public int numIslands(char[][] grid) {

        if(grid == null) return -1;
        int row = grid.length;
        if(row == 0) return -1;
        int column = grid[0].length;
        root = new int[row*column];
        int [][] lists = {{0,1},{0,-1},{1,0},{-1,0}};

        for(int i= 0;i<row*column;i++){
            root[i] = i;
        }
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                if(grid[i][j] == '1'){
                    count++;
                    for(int[] list:lists){
                        int x = i + list[0];
                        int y = j + list[1];
                        if(x>=0&&x<row&&y>=0&&y<column&&grid[x][y] == '1') {
                            union(x*column+y,i*column+j);
                        }
                    }
                }
            }
        }

        return count-uniCount; //岛的数量减去同化的数量 就剩多少片岛
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
            root[rootX]=rootY;  //发生同化
            uniCount ++;
        }
    }

}
