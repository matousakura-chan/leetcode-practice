package com.chen.SwordForOffer.FiveOne.Other;

import com.sun.scenario.effect.Merge;

/**
 * 归并排序判断条件带有等于号才是稳定排序
 * 归并排序 始终记着图
 *
 */

public class Solution {

    int count =  0;
    int [] temp;

    public int reversePairs(int[] nums) {

        temp = new int[nums.length];
        mergeSort(nums,0,nums.length-1);
        return count;
    }

    private void mergeSort(int[] nums,int left,int right){

        if(right - left < 1) return;

        int mid = left+(right-left)/2;

        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,mid,right);

    }
    private void merge(int[] nums,int left,int mid,int right){


        int i = left,j = mid+1,k = left;
        while (i <= mid||j <= right){

            if (i > mid)
                temp[k] = nums[j++];
            else if (j > mid)
                temp[k] = nums[i++];
            else if (nums[i] <= nums[j])
                temp[k] = nums[i++];
            else {
                temp[k] = nums[j++];
                count += mid - i + 1;
            }
            k++;
        }
        for (k = left;k<=right;k++)
            nums[k] = temp[k];
    }
}
