package com.chen.leetcode.Four;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        if (m == 0 && n == 0) return -1;
        if (m == 0) return n % 2 == 0 ? (double) (nums2[n / 2] + nums2[n / 2 - 1]) / 2 : nums2[n / 2];
        if (n == 0) return m % 2 == 0 ? (double) (nums1[m / 2] + nums1[m / 2 - 1]) / 2 : nums1[m / 2];


        int res1 = 0, res2 = 0, step = 1, i = 0, j = 0;

        if (nums1[0] <= nums2[0])        res1 = nums1[i++];
        else if (nums1[0] > nums2[0])    res1 = nums2[j++];

        while (true) {
            if(i == m){
                res2 = res1;
                res1 = nums2[j++];
                step++;
            }else if(j == n){
                res2 = res1;
                res1 = nums1[i++];
                step++;
            } else if(nums1[i] <= nums2[j]) {
                res2 = res1;
                res1 = nums1[i++];
                step++;
            } else if (j!=n&&nums1[i] > nums2[j]) {
                res2 = res1;
                res1 = nums2[j++];
                step++;
            }
            if (step > (m + n) / 2 && (m + n) % 2 == 1) return Math.max(res1, res2);
            if (step > (m + n) / 2 && (m + n) % 2 == 0) return (double) (res1 + res2) / 2;
        }
    }
}
