package com.chen.SwordForOffer.ThreeFive;

import com.chen.common.Node;

public class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node dummy = head;

        //复制一份
        while (dummy != null){
            Node newNode = new Node(dummy.val);
            newNode.next = dummy.next;
            dummy.next = newNode;
            dummy = newNode.next;
        }

        //链接随机节点
        dummy = head;
        while (dummy != null){
            Node next = dummy.next;
            if(dummy.random!=null)
                next.random = dummy.random.next;
            dummy = next.next;
        }

        dummy = head;
        Node copyHead = head.next;

        while (dummy != null){
            Node copy = dummy.next;
            dummy.next = copy.next;

            if(copy.next != null)
                copy.next = copy.next.next;

            dummy = dummy.next;
        }
        return copyHead;
    }
}