package com.chen.test;

import com.chen.common.ListNode;
import com.chen.common.Node;
import com.chen.common.TreeNode;
import com.chen.leetcode.TwoOne.Solution;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class Demo01 {

    @Test
    public void test(){

        ListNode list1 = new ListNode(1);
        list1.add(2).add(4);
        ListNode list2 = new ListNode(1);
        list2.add(3).add(4);

        Solution solution = new Solution();
        solution.mergeTwoLists(list1,list2).print();
    }

    @Test
    public void test31(){

        com.chen.leetcode.ThreeOne.Solution solution = new com.chen.leetcode.ThreeOne.Solution();
        int [] a = {5,4,7,5,3,2};
        solution.nextPermutation(a);
        for(int num:a)
            System.out.println(num);
    }

    @Test
    public void test32(){
        com.chen.leetcode.ThreeTwo.Solution solution = new com.chen.leetcode.ThreeTwo.Solution();
        String s = "()";
        System.out.println(solution.longestValidParentheses(s));
    }

    @Test
    public void test1006(){
        com.chen.leetcode.OneZeroZeroSix.Solution solution = new com.chen.leetcode.OneZeroZeroSix.Solution();
        String s = "()";
        System.out.println(solution.clumsy(10));
    }

    @Test
    public void test33(){
        com.chen.leetcode.ThreeThree.Solution solution = new com.chen.leetcode.ThreeThree.Solution();
        int[] s = {4,5,6,7,0,1,2};
        System.out.println(solution.search(s,6));
    }

    @Test
    public void test1721(){
        com.chen.leetcode.OneSevenPointTwoOne.Solution2 solution = new com.chen.leetcode.OneSevenPointTwoOne.Solution2();
        //int[] s = {0,1,0,2,1,0,1,3,2,1,2,1};
        //int[] s ={4,9,4,5,3,2};
        int [] s = {2,0,2};
        //int[] s = {0,2,0};
        System.out.println(solution.trap(s));
    }

    @Test
    public void test39(){
        com.chen.leetcode.ThreeNine.Solution solution = new com.chen.leetcode.ThreeNine.Solution();
        int[] a={2,3,6,7};
        for(List<Integer> list:solution.combinationSum(a,7)){
            System.out.println(list.toString());
        }

    }

    @Test
    public void test56(){
        com.chen.leetcode.FiveSix.Solution solution = new com.chen.leetcode.FiveSix.Solution();
        //int [][] a = {{1,4},{0,2},{3,5}};
        int [][] a ={{1,3}, {2,6},{8,10},{15,18}};
        //int [][] a = {{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}};
        for (int [] res:solution.merge(a)){
            System.out.println(Arrays.toString(res));
        }
    }
    @Test
    public void test72(){
        com.chen.leetcode.SevenTwo.Solution solution = new com.chen.leetcode.SevenTwo.Solution();
        //int [][] a = {{1,4},{0,2},{3,5}};
        int [][] a ={{1,3}, {2,6},{8,10},{15,18}};
        //int [][] a = {{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}};
        //System.out.println(solution.minDistance("intention", "execution"));
        System.out.println(solution.minDistance("sea", "ate"));
    }

    @Test
    public void test75(){
        com.chen.leetcode.SevenFive.Solution solution = new com.chen.leetcode.SevenFive.Solution();

        int [] a ={2,0,2,1,1,0};

        solution.sortColors(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void test76(){
        com.chen.leetcode.SevenSix.Solution solution = new com.chen.leetcode.SevenSix.Solution();

        int [] a ={2,0,2,1,1,0};

        System.out.println(solution.minWindow("A", "A"));
    }

    @Test
    public void test79(){
        com.chen.leetcode.SevenNine.Solution2 solution = new com.chen.leetcode.SevenNine.Solution2();
        char[][] board = {{'a','b'}};
        String s = "ba";
        System.out.println(solution.exist(board, s));
    }


    @Test
    public void test84(){
        com.chen.leetcode.EightFour.Solution solution = new com.chen.leetcode.EightFour.Solution();
        int [] a = {5,4,1,2};
        System.out.println(solution.largestRectangleArea(a));
    }
    @Test
    public void test85(){
        com.chen.leetcode.EightFive.Solution solution = new com.chen.leetcode.EightFive.Solution();
        char [][] a = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(solution.maximalRectangle(a));
    }

    @Test
    public void test80(){
        com.chen.leetcode.EightZero.Solution solution = new com.chen.leetcode.EightZero.Solution();
        //int [] a = {0,0,0,0,0};
        int [] a = {1,1,1,2,2,3};
        solution.removeDuplicates(a);
    }

    @Test
    public void test26(){
        com.chen.leetcode.TwoSix.Solution solution = new com.chen.leetcode.TwoSix.Solution();
        int [] a = {0,0,1,1,1,2,2,3,3,4};
        //int [] a = {1,1,1,2,2,3};
        solution.removeDuplicates(a);
    }

    @Test
    public void test154(){
        com.chen.leetcode.OneFiveFour.Solution solution = new com.chen.leetcode.OneFiveFour.Solution();
        int [] a = {2,2,2,0,1};
        //int [] a = {1,1,1,2,2,3};
        System.out.println(solution.findMin(a));
    }

    @Test
    public void testSFO29(){
        com.chen.SwordForOffer.TwoNine.Solution solution = new com.chen.SwordForOffer.TwoNine.Solution();
        int [][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //int [] a = {1,1,1,2,2,3};
        for(int s :solution.spiralOrder(a))
            System.out.println(s);
    }

    @Test
    public void test213(){
        com.chen.leetcode.TwoOneThree.Solution solution = new com.chen.leetcode.TwoOneThree.Solution();
        int [] a = {2,7,9,3,1};
        //int [] a = {1,1,1,2,2,3};
        solution.rob(a);
    }

    @Test
    public void testSFO35(){
        com.chen.SwordForOffer.ThreeFive.Solution solution = new com.chen.SwordForOffer.ThreeFive.Solution();
        Node head = new Node(7);
        head.add(13).add(11).add(10).add(1);
        head.print();
        //int [] a = {1,1,1,2,2,3};
        solution.copyRandomList(head);
    }

    @Test
    public void test28(){
        com.chen.leetcode.TwoEight.Solution solution = new com.chen.leetcode.TwoEight.Solution();
//        String n = "aabaaabaaac";
//        String k = "aabaaac";
        String n = "issip";
        String k = "mississippi";
        System.out.println(k);
        System.out.println(n);
        //"mississippi"
        //"issip"
        System.out.println(solution.strStr(k, n));
    }

    @Test
    public void testSFO37(){
        com.chen.SwordForOffer.ThreeSeven.Codec codec = new com.chen.SwordForOffer.ThreeSeven.Codec();
//        TreeNode root = new TreeNode(10,
//                new TreeNode(5,
//                        new TreeNode(3),
//                        new TreeNode(7)),
//                new TreeNode(15, null,
//                        new TreeNode(7)));
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3,
                        new TreeNode(4),
                        new TreeNode(5)));
        System.out.println(codec.serialize(root));
    }

    @Test
    public void test304(){
        int [][] a = {{-1}};
        com.chen.leetcode.ThreeZeroFour.NumMatrix matrix = new com.chen.leetcode.ThreeZeroFour.NumMatrix(a);
        System.out.println(matrix.sumRegion(0, 0, 0, 0));
    }

    @Test
    public void test368(){
        int [] a = {4,8,10,240};
        com.chen.leetcode.ThreeSixEight.Solution matrix = new com.chen.leetcode.ThreeSixEight.Solution();
        matrix.largestDivisibleSubset(a);
    }









}
