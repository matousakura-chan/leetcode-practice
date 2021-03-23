package com.chen.leetcode.NineOneTwo;

import java.util.Random;

class Solution {
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    // 把数组分为两半，返回分割中点
    public int change(int[] nums, int low, int high) {
//        // 随机化
//        Random rm = new Random();
//        // [0, high]
//        int index = rm.nextInt(high-low+1) + low;
//        swap(nums, index, low);

        // low变成一个洞
        int pivot = nums[low];
        while (low < high) {
            while (low < high && nums[high] > pivot) high--;
            nums[low] = nums[high];
            while (low < high && nums[low] <= pivot) low++;
            nums[high] = nums[low];
        }
        nums[low] = pivot;
        return low;
    }

    // 快速排序
    public void quickSort(int[] nums, int low, int high) {
        if (low >= high) return;
        // 左右两边有序
        int mid = change(nums, low, high);
        quickSort(nums, low, mid - 1);
        quickSort(nums, mid + 1, high);
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}