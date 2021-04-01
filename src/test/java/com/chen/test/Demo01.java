package com.chen.test;

import com.chen.common.ListNode;
import com.chen.leetcode.TwoOne.Solution;
import org.junit.Test;

import java.util.Arrays;

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


}
