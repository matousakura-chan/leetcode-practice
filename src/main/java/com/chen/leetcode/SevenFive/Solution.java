package com.chen.leetcode.SevenFive;

import java.util.Arrays;

public class Solution {

    public void sortColors(int[] nums) {

        if(nums.length < 2) return;

        int l = 0,r = nums.length-1;
        sort(nums,l,r);
    }

    private void sort(int[] nums,int l,int r){
        if(l==r) return;

        int left = l;
        int right = r;

        int pivot = nums[l];

        while (l<r){
            while (l<r&&nums[r]>=pivot) r--;
            nums[l] = nums[r];
            while (l<r&&nums[l]<pivot) l++;
            nums[r] = nums[l];
        }
        nums[l] = pivot;
        sort(nums,left,l);
        sort(nums,l+1,right);
    }

}
