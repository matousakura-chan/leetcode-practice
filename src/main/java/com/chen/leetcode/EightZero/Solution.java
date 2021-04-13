package com.chen.leetcode.EightZero;

public class Solution {

    public int removeDuplicates(int[] nums) {

        if(nums.length < 2) return nums.length;

        int l = 0,count = 0;
        for (int r = 1; r < nums.length; r++) {
            if(nums[r] != nums[l]){
                count = 0;
                nums[++l] = nums[r];
            }else{
                if(count == 0){
                    count++;
                    nums[++l] = nums[r];
                }
            }
        }

        return l+1;
    }

    public int removeDuplicates1(int[] nums) {


        int l = 0;
        for (int n:nums){
            if(l>2|| n != nums[l-2])
                nums[l++] = n;
        }
        return l;
    }
}
