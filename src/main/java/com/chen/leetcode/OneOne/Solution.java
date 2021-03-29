package com.chen.leetcode.OneOne;

public class Solution {

    public int maxArea(int[] height) {

        int i = 0,j = height.length,area = 0;

        while (i!= j){
            area = Math.max(area,(j-i)*Math.min(height[i],height[j]));
            if(height[i]>height[j]) j--;
            else i++;
        }
        return area;
    }
}
