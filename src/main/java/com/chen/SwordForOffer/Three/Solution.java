package com.chen.SwordForOffer.Three;

public class Solution {


    public int findRepeatNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i){
                if(nums[nums[i]] != nums[i]){
                    nums[nums[i]] = nums[i];
                }else {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
