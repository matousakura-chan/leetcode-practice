package com.chen.leetcode.SevenEightOne;

import java.util.Arrays;

/**
 * 两只相同颜色的兔子看到的其他同色兔子数必然是相同的。
 * 反之，若两只兔子看到的其他同色兔子数不同，那么这两只兔子颜色也不同。
 */

public class Solution {

    public int numRabbits(int[] answers) {

        int result = 0;
        Arrays.sort(answers);
        for (int i = 0; i < answers.length; i++) {
            result += answers[i];
            int temp = answers[i];
            while (i+1<answers.length&&answers[i+1]==answers[i]&&temp>0) {
                i++;
                temp--;
            }
        }
        return result;
    }
}
