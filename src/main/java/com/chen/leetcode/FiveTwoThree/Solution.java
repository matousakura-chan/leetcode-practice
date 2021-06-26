package com.chen.leetcode.FiveTwoThree;

import java.util.HashMap;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        if(nums.length == 1) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);

        for (int i = 0; i < nums.length; i++) {
            if(i>0)
                nums[i] += nums[i-1];

            int temp = nums[i]%k;
            if(map.containsKey(temp)){
                if(i - map.get(temp) > 1)
                    return true;
            }
            else
                map.put(temp,i);
        }
        return false;
    }
}