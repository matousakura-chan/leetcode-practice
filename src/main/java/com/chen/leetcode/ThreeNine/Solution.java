package com.chen.leetcode.ThreeNine;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    int sum = 0;
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        if(candidates.length==0) return null;
        Arrays.sort(candidates);
        backtrack(candidates, target,0);

        return result;
    }

    private void backtrack(int[] candidates, int target,int begin){

        if(sum>target) return;
        if(sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            int num = candidates[i];

            list.add(num);
            sum += num;
            backtrack(candidates, target,i);
            list.remove(list.size() - 1);
            sum -= num;
        }
    }
}