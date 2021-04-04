package com.chen.leetcode.OneSevenPointTwoOne;

public class Solution2 {
    public int trap(int[] height) {
        if(height.length<3) return 0;

        int black = 0;
        for (int a:height){
            black += a;
        }

        int total = 0;
        int top = 1;
        int left = 0,right = height.length-1;
        while (left!=right||height[left]>=top||height[left]>=top){
            while (height[left]<top&&left!=right) left++;
            while (height[right]<top&&left!=right) right--;
            if(height[left]>=top||height[right]>=top){
                total += right - left + 1;
            }
            top++;
        }
        return total-black>0?total-black:0;
    }
}
