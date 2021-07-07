package com.chen.leetcode.TwoZeroSeven;

import java.util.*;

//拓扑图 2021.7.2
//210 ->图

/**
 * 每个节点应该有三种状态
 * 未被访问是0 访问是1 访问玩是2
 */

class Solution {

    //存储图
    List<List<Integer>> list;
    int[] visited;
    boolean flag;

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        //构建图
        list = new ArrayList<>();
        visited = new int[prerequisites.length];
        flag = true;

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
        return flag;
    }

    private void dfs(int index) {

        visited[index] = 1;
        for (Integer num : list.get(index)) {
            //下个结点没有被访问
            if (visited[num] == 0) {
                dfs(num);
            } else if (visited[num] == 1) {
                flag = false;
                return;
            }
        }
        visited[index] = 2;
    }
}









//
//public class Solution {
//
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//
//        //记录所有的课程
//        //用拉链解决哈希冲突?
//        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
//        HashSet<Integer> set = new HashSet<>();
//        //在循环中记录存在过的表格 若没有重复则应该不会访问到
//        for (int[] ints : prerequisites) {
//            //拉链
//            if(!map.containsKey(ints[0])){
//                LinkedList<Integer> list = new LinkedList<>();
//                list.add(ints[1]);
//                map.put(ints[0],list);
//            }else {
//                map.get(ints[0]).add(ints[1]);
//            }
//
//        }
//        for (int[] ints : prerequisites) {
//            int current = ints[1];
//            //在表中找有没有下一个索引
//            while (map.containsKey(current)){
//                if(set.contains(current))
//                    return false;
//                set.add(current);
//                current = map.get(current);
//            }
//            for (Integer pre : set) {
//                map.put(pre,-1);
//            }
//            set.clear();
//        }
//        return true;
//    }
//}
