package com.chen.leetcode.TwoZeroZero;

public class Solution {

    int res = 0;
    char curr = '0';

    public int numIslands(char[][] grid) {

        if (grid == null) return -1;
        int row = grid.length;
        if (row == 0) return -1;
        int column = grid[0].length;

        dfs(grid, column, row, 0, 0);
        return res;
    }

    void dfs(char[][] grid, int column, int row, int c, int r) {
        if (r >= row) return;

        if (c != column && grid[r][c] == '1') {
            assimilate(grid, column, row, c, r);
            res++;
        }
        if (c == column) {
            dfs(grid, column, row, 0, r + 1);
        } else {
            dfs(grid, column, row, c + 1, r);
        }
    }

    void assimilate(char[][] grid, int column, int row, int c, int r) {

        if (c >= column || r >= row) return;

        if (grid[r][c] == '0') return;

        grid[r][c] = '0';
        if (c + 1 < column) assimilate(grid, column, row, c + 1, r);
        if (r + 1 < row) assimilate(grid, column, row, c, r + 1);
        if (r - 1 >= 0) assimilate(grid, column, row, c, r - 1);
        if (c - 1 >= 0) assimilate(grid, column, row, c - 1, r);
    }
}
