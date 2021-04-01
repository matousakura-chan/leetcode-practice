package com.chen.leetcode.ThreeOne;

import java.util.Arrays;

/**
 * 从后往前找，找到第一个下降的位置，记为 k。注意k 以后的位置是降序的。
 *
 * 从 k 往后找，找到最小的比 k 要大的数。
 *
 * 将两者交换。注意此时 k 以后的位置仍然是降序的。
 *
 * 直接将 k 以后的部分翻转（变为升序）
 *
 */

public class Solution {

    public void nextPermutation(int[] nums) {

        if(nums.length < 2) return;
        //从后往前找，找到第一个下降的位置，记为 k。注意k 以后的位置是降序的。
        int k = -1;
        int temp = 0;
        for (int i = nums.length - 1 ; i > 0; i--) {
            if(nums[i]> nums[i-1]){
                k = i - 1;
                break;
            }

        }
        //从 k 往后找，找到最小的比 k 要大的数。
        if(k == -1){//没有比他小的数字
            int i = 0,j = nums.length-1;
            while (i<=j){
                temp = nums[i];
                nums[i++] = nums[j];
                nums[j--] = temp;
            }
            return;
        }
        //从 k 往后找，找到最小的比 k 要大的数。
        temp = Integer.MAX_VALUE;
        int p = 0;
        for(int i = k+1;i<nums.length;i++){
            if(nums[i]>nums[k]){
                temp = Math.min(temp,nums[i]);
                if(temp == nums[i]) p = i;
            }
        }
        //将两者交换。注意此时 k 以后的位置仍然是降序的。
        temp = nums[k];
        nums[k] = nums[p];
        nums[p] = temp;
        //直接将 k 以后的部分翻转（变为升序）
        Arrays.sort(nums,k+1,nums.length);

    }

}
