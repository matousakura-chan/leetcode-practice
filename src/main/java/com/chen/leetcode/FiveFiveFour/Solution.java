package com.chen.leetcode.FiveFiveFour;

import java.util.HashMap;
import java.util.List;

public class Solution {
    public int leastBricks(List<List<Integer>> wall) {

        if(wall == null) return -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (List<Integer> subList:wall){
            int pre = 0;
            for (Integer num:subList){
                num += pre;
                pre = num;
                map.put(num,map.getOrDefault(num,0)+1);
            }
            map.remove(subList.get(subList.size()-1));
        }


        int max = 0;
        for(int num:map.keySet()){
            max = Math.max(max,map.get(num));
        }

        return wall.size()-max;
    }
}