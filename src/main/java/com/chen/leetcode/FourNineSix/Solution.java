package com.chen.leetcode.FourNineSix;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {

        if (nums1 == null) return null;
        nums1[nums1.length - 1] = -1;
        boolean finded = false;

        for (int i = 0; i < nums1.length - 1; i++) {
            int minMax = -1;
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums1[i] < nums2[j]) {
                    if (!finded) minMax = nums2[j];
                    finded = true;
                }
            }
            nums1[i] = minMax;
        }
        return nums1;
    }


    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        if (nums1 == null) return null;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        for (int a : nums2) {
            stack.add(a);
        }
        for (int i = 0; i < nums1.length; i++) {
            boolean finded = false;
            while (stack.peek() != nums1[i]) {
                temp.push(stack.pop());
            }
            while (!temp.isEmpty()) {
                if (!finded && temp.peek() > nums1[i]) {
                    finded = true;
                    nums1[i] = temp.peek();
                }
                stack.push(temp.pop());
            }
            if (!finded) nums1[i] = -1;
        }
        return nums1;
    }
}