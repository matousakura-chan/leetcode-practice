package com.chen.SwordForOffer.FiveOne;

public class Solution {
    public int search(int[] nums, int target) {

        if(nums.length==0) return 0;

        int first = binarySearch(nums,target);
        int last = binarySearch(nums,target+1);
        return first == nums.length||nums[first]==target?0:last-first;
    }
    private int binarySearch(int[] nums, int target){
        int l = 0,r = nums.length;
        while (l<r){

            int mid = (l+r)>>1;
            if(nums[mid]>=target)
                r = mid;
            else
                l = mid+1;
        }
        return l;
    }
}
