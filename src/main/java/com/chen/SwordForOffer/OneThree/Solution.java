package com.chen.SwordForOffer.OneThree;

public class Solution {

    private static final int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    int row;
    int column;
    int count;
    int target;
    boolean [][] marked;
    int [][] nums;

    public int movingCount(int m, int n, int k) {

        this.row = m;
        this.column = n;
        this.target = k;
        
        marked = new boolean[m][n];
        nums = new int [m][n];
        for (int i = 0; i < nums.length; i++) {

            int tempR = i,sumR = 0;
            while (tempR!=0){
                sumR += tempR%10;
                tempR /= 10;
            }
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j]+=sumR;
                int tempC = j;
                while (tempC != 0){
                    nums[i][j] += tempC%10;
                    tempC /= 10;
                }
            }
        }
        dfs(0,0);
        return count;
    }

    private void dfs(int i, int j){
        if(i<0||i>=row||j<0||j>=column||marked[i][j])
            return;

        marked[i][j] = true;

        if(nums[i][j]<=target){
            count++;
            for (int[] n : next) {
                dfs(n[0]+i,n[1]+j);
            }
        }
    }
}