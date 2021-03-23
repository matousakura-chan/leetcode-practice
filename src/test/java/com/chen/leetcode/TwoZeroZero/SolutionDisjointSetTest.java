package com.chen.leetcode.TwoZeroZero;

import junit.framework.TestCase;

public class SolutionDisjointSetTest extends TestCase {

    public void test(){
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'1','0','1','0','0'},
                {'0','1','0','1','1'}
        };
        SolutionDisjointSet solutionDisjointSet = new SolutionDisjointSet();
        System.out.println(solutionDisjointSet.numIslands(grid));
    }



}