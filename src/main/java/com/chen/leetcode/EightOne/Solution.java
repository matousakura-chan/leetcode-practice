package com.chen.leetcode.EightOne;

/**
 *二分查找
 *
 */

public class Solution {

    boolean flag = false;

    public boolean search(int[] nums, int target) {
        if(nums.length==0) return false;
        if(nums.length==1&&nums[0] == target) return true;

        subSearch(nums,target,0,nums.length-1);
        return flag;

    }

    public void subSearch(int[] nums, int target,int star,int end){

        int mid = (star+end)/2;

        if(nums[star] == target||nums[end]==target||nums[mid]==target){
            flag = true;
            return;
        }
        if(star>=end) return;

        subSearch(nums,target,star,mid);
        subSearch(nums,target,mid,end);
    }



//    public boolean search(int[] nums, int target) {
//
//        if(nums.length==0) return false;
//        if(nums.length==1&&nums[0] == target) return true;
//
//        int l = 0 ,r = nums.length-1;
//        int m = 0;
//
//        while (l<r){
//            m = (l+r)/2;
//            if(nums[m]==target) return true;
//            else if(nums[m]<target&&nums[r]>target){
//                l = m+1;
//            }else r = m;
//
//        }
//        return false;
//    }
}
