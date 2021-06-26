package com.chen.leetcode.OneThree;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public int romanToInt(String s) {

        int [] nums = {1,5,10,50,100,500,1000};
        char [] chars = {'I','V','X','L','C','D','M'};

        char[] inputString = s.toCharArray();
        int outputNum = 0;


        int j = 0;
        for (int i = inputString.length-1; i >=0;i--) {
            if(j>0 && chars[j-1] == inputString[i]){
                outputNum -= nums[j-1];
                continue;
            }
            while (chars[j] != inputString[i])
                j++;
            outputNum += nums[j];
        }
        return outputNum;
    }
}
