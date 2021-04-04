package com.chen.leetcode.FiveSix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    List<int []> result = new ArrayList<>();

    public int[][] merge(int[][] intervals) {

        if(intervals.length == 0) return null;

        Arrays.sort(intervals,(n1,n2)->{
            return n1[0]-n2[0];
        });

        result.addAll(Arrays.asList(intervals));

        boolean isFinally = false;
        while (!isFinally){
            List<int[]> tempResult = new ArrayList<>(result);
//            for(int[] a:tempResult){
//                System.out.println(Arrays.toString(a));
//            }
//            System.out.println("-------------");
            isFinally = isFinallyMerge(tempResult.toArray(new int[tempResult.size()][]));
        }
        return result.toArray(new int[result.size()][]);
    }

    public boolean isFinallyMerge(int[][] intervals){

        boolean flag = true;
        result.clear();

        for (int i = 0; i < intervals.length;) {
            int temp = i+1;
            int [] tempList = new int[2];
            while (temp < intervals.length && intervals[i][1]>=intervals[temp][1]) {
                temp++;
                flag =false;
            }
            if(temp == intervals.length){
                tempList[0] = intervals[i][0];
                tempList[1] = intervals[i][1];
                result.add(tempList);
                break;
            }

            if(intervals[i][1]>=intervals[temp][0]){  //合并ab cd ad
                flag = false;
                tempList[0] = intervals[i][0];
                tempList[1] = intervals[temp][1];
                result.add(tempList);
            }else{
                tempList[0] = intervals[i][0];   //包前面
                tempList[1] = intervals[i][1];
                result.add(tempList);
            }
            i = temp;
        }
        return flag;
    }
}
