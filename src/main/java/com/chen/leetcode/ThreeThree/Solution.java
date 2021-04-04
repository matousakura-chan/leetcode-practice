package com.chen.leetcode.ThreeThree;

public class Solution {

    public int search(int[] nums, int target) {

        int left = 0,right = nums.length-1;
        int mid = (left+right)/2;

        if(target == nums[left]) return left;
        if(target == nums[right]) return right;
        if(nums.length ==1){
            if(nums[0] == target) return 0;
            else return -1;
        }

        //没有旋转
        if(nums[left] < nums[right]){
            return subSearch(nums,left,right,target);
        }else{
            //位于递增数组
            if(nums[mid]>nums[left]){
                while (nums[mid]<nums[mid+1]) mid++;

            }
            //位于递减数组
            else{
                while (nums[mid]<nums[mid+1]) mid--;

            }

            if(target>nums[left]){
                right = mid;
                return subSearch(nums,left,right,target);
            }else if(target<nums[left]){
                left = mid+1;
                return subSearch(nums,left,right,target);
            }
        }

        return -1;
    }

    private int subSearch(int[] nums,int left,int right,int target){
        if(nums[left]>target||nums[right]<target)
            return -1;
        if(target == nums[left]) return left;
        if(target == nums[right]) return right;

        int mid = (left+right)/2;
        while (left<right-1){
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                left = mid;
                mid = (left+right)/2;
            }else {
                right = mid;
                mid = (left+right)/2;
            }
        }
        return -1;
    }
}
