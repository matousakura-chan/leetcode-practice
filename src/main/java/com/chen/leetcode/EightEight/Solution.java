package com.chen.leetcode.EightEight;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n == 0){
            return;
        }
        if(m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }


        int i = m-1;
        int j = nums2.length-1;
        int p = nums1.length-1;

        while (j>=0&&p != -1){
            if(i==-1||nums2[j]>=nums1[i]){
                nums1[p--] = nums2[j--];
            }else{
                nums1[p--] = nums1[i--];
            }
        }
    }
}
