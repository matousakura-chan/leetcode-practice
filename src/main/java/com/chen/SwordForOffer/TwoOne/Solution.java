package com.chen.SwordForOffer.TwoOne;


class Solution {
    public int[] exchange(int[] nums) {


        int left = 0,right = nums.length-1;
        while (left<right){
            while (nums[left]%2 == 0&&left<right) left++;
            while (nums[right]%2 == 1&&left<right) right--;
            swap(nums,left,right);
        }
        return nums;
    }


    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}