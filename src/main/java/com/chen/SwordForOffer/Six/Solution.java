package com.chen.SwordForOffer.Six;

import com.chen.common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {


    public int[] reversePrint(ListNode head) {
        return reverse(head).stream().mapToInt(Integer::valueOf).toArray();
    }

    public ArrayList<Integer> reverse(ListNode head){

        ArrayList<Integer> list = new ArrayList<>();
        if(head!=null){
            list.addAll(reverse(head.next));
            list.add(head.val);
        }
        return list;
    }
}
