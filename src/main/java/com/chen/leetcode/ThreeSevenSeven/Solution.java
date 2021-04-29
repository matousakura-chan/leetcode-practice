package com.chen.leetcode.ThreeSevenSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    List<List<Integer>> list = new ArrayList<>();
    List<Integer> subList = new ArrayList<>();
    int sum = 0;
    public int combinationSum4(int[] nums, int target) {

        if(nums.length == 0) return 0;
        if(nums.length == 1)
            if (nums[0]==target) return nums.length;
            else return 0;

        Arrays.sort(nums);
        backTracking(nums,target);
        return list.size();

    }
    private void backTracking(int[] nums,int target){

        if(sum == target){
            list.add(new ArrayList<>(subList));
            return;
        }

        if(sum>target) return;

        for (int num : nums) {
            sum += num;
            subList.add(num);
            backTracking(nums, target);
            sum -= num;
            subList.remove(subList.size() - 1);
        }
    }
}