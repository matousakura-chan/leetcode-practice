package com.chen.leetcode.TwoOneZero;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    //存储图
    List<List<Integer>> list;
    int[] visited;
    int[] res;
    int ind;
    boolean  flag = true;

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        //构建图
        list = new ArrayList<>();
        visited = new int[numCourses];
        res = new int[numCourses];
        ind = numCourses - 1;

        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        //拉链法
        for (int[] nums : prerequisites) {
            list.get(nums[1]).add(nums[0]);
        }

        //深度优先搜索
        for (int i = 0; i < numCourses && flag; i++) {
            dfs(i);
        }
        //有环返回空
        if (!flag) {
            return new int[0];
        }
        return res;
    }

    private void dfs(int index) {

        visited[index] = 1;
        for (Integer num : list.get(index)) {
            //下个结点没有被访问
            if (visited[num] == 0) {
                dfs(num);
                if (!flag) {
                    return;
                }
            } else if (visited[num] == 1) {
                flag = false;
                return;
            }
        }
        visited[index] = 2;
       res[ind--] = index;
    }
}