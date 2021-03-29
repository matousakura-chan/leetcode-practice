package com.chen.leetcode.OneFive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        if(nums.length<3) return list;

        Arrays.sort(nums);
        if(nums[0]>0) return list;
        if(nums[nums.length-1]<0) return list;

        for (int i = 0; i < nums.length-2; i++) {
            if(i>0&&nums[i] == nums[i-1]) continue;
            int left = i+1,right = nums.length-1;
            while (left<right){
                int temp = 0;
                if(nums[left]+nums[right]+nums[i] == 0){
                    list.add(Arrays.asList(nums[i],nums[right],nums[left]));

                    while (nums[left] == nums[++left]&&left<right);
                    while (nums[right] == nums[--right]&&left<right);

                }else if(nums[left]+nums[right]+nums[i] < 0){

                    while (nums[left] == nums[++left]&&left<right);

                }else if(nums[left]+nums[right]+nums[i] > 0){

                    while (nums[right] == nums[--right]&&left<right);
                }
            }
        }
        return list;
    }
}
