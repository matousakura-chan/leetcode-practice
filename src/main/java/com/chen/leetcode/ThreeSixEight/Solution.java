package com.chen.leetcode.ThreeSixEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {

        List<Integer> list = new ArrayList<>();

        if(nums.length==0||nums.length==1) {
            for (int a:nums)
                list.add(a);
            return list;
        }

        Arrays.sort(nums);

        int [] dpNums = new int[nums.length];
        int [] dpIndex = new int[nums.length];

        dpNums[0] = 1;dpIndex[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if(nums[i]%nums[j] == 0){
                    if(dpNums[i] == 0){
                        dpNums[i] = dpNums[j]+1;
                        dpIndex[i] = j;
                    }else {
                        if(dpNums[i]<dpNums[j]+1){
                            dpNums[i] = dpNums[j]+1;
                            dpIndex[i] = j;
                        }
                    }

                    //一旦找到最大的退出
                }
            }
            //表示没有找到
            if(dpNums[i] == 0){
                //第一个的话就是他本身
                dpNums[i] = 1;
                dpIndex[i] = i;
            }
        }

        System.out.println(Arrays.toString(dpNums));
        System.out.println(Arrays.toString(dpIndex));

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < dpNums.length; i++) {
            if(max < dpNums[i]){
                max = dpNums[i];
                maxIndex = i;
            }
        }

        while (list.size()!=max){
            list.add(nums[maxIndex]);
            maxIndex = dpIndex[maxIndex];
        }

        return list;
    }
}