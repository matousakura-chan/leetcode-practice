package com.chen.leetcode.SixTwo;

public class Solution {

    int [][] mash = null;
    public int uniquePaths(int m, int n) {

        if(m == 0) return -1;
        if(m == 1) return 1;

        mash = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i == 0) {
                    mash[i][j]=1;
                    continue;
                }else if(j == 0){
                    mash[i][j] = mash[i - 1][j];
                }else{
                    mash[i][j] = mash[i - 1][j]+mash[i][j-1];
                }
            }
        }
        for(int [] mas:mash){
           for(int ma:mas)
               System.out.print(ma+" ");
            System.out.println();
        }
        return mash[m-1][n-1];
    }
}
