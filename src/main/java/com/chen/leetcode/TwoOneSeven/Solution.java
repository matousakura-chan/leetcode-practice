package com.chen.leetcode.TwoOneSeven;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> map = new HashSet<>();
        for (int a : nums) {
            if (map.contains(a))
                return true;
            map.add(a);
        }
        return false;
    }
}