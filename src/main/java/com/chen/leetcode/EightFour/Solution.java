package com.chen.leetcode.EightFour;

import java.util.Stack;

public class Solution {


    /**
     * 用栈 且一般都放索引
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int area  = 0;

        for (int i = 0; i < heights.length; i++) {
            //弹出计算面积
            while (stack.peek()!=-1&&heights[i]<heights[stack.peek()]){
                int index =  stack.pop();
                int length = i -1 - stack.peek();
                area = Math.max(area,length*heights[index]);
            }
            stack.push(i);
        }
        while (stack.size()!=1){
            int index =  stack.pop();
            int length = heights.length - 1  - stack.peek();
            area = Math.max(area,length*heights[index]);
        }
        return area;
    }


    //power
    public int largestRectangleArea2(int[] heights) {

        int area = 0;

        for (int i = 0; i < heights.length; i++) {
            int l = i;
            int r = i;
            while (l-1>=0&&heights[l-1]>=heights[i]) l--;
            while (r+1<heights.length&&heights[r+1]>=heights[i]) r++;
            area = Math.max(area,(r-l+1)*heights[i]);
        }

        return area;
    }
}
