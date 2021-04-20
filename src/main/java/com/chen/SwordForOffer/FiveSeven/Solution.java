package com.chen.SwordForOffer.FiveSeven;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int [] res = new int [2];

        if(nums.length<2) return res;
        int i = 0 ,j  = nums.length-1;

        while (i<=j){
            if(nums[i]+nums[j]<target)
                i++;
            else if(nums[i]+nums[j]>target)
                j--;
            else {
                res[0] = nums[i];
                res[1] = nums[j];
                break;
            }
        }
        return res;
    }
}
