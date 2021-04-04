package com.chen.leetcode.ThreeFour;

import java.util.Arrays;

public class Solution {

    public int[] searchRange(int[] nums, int target) {

        int res[] = {-1,-1};

        if(nums.length == 0) return res;

        int l = 0,r = nums.length-1,m = (l+r)/2;
        while (l<r){
            if(nums[m]<target){
                l = m+1;
                m = (l+r)/2;
            }else if(nums[m]>target){
                r = m;
                m = (l+r)/2;
            }else break;
        }
        if(nums[m] != target) return res;

        res[0] = m;
        res[1] = m;
        while (res[1]+1<nums.length&&nums[res[1]+1] == target) res[1]++;
        while (res[0]-1>=0&&nums[res[0]-1] == target) res[0]--;

        return res;

    }
}
