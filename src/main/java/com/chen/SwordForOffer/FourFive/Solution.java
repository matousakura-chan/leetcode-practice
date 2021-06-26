package com.chen.SwordForOffer.FourFive;

import java.util.Arrays;

public class Solution {
    public String minNumber(int[] nums) {

        if(nums.length == 0) return "";

        StringBuilder s = new StringBuilder();

        String [] numbers = new String[nums.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = nums[i]+"";
        }

        Arrays.sort(numbers,(s1,s2)-> (s1 + s2).compareTo(s2 + s1));

        for (String number : numbers) {
            s.append(number);
        }
        return s.toString();
    }
}