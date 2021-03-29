package com.chen.test;

import com.chen.common.ListNode;
import com.chen.leetcode.TwoOne.Solution;
import org.junit.Test;

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
}
