package com.chen.SwordForOffer.ThreeSix;

import com.chen.common.unusual.Node;

public class Solution {
    private Node head = null;
    private Node pre = null;

    public Node treeToDoublyList(Node root) {

        if(root == null) return null;

        LDR(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void LDR(Node root){

        if(root == null) return;
        LDR(root.left);

        //左指针调整为指向前一个节点
        root.left = pre;
        if (pre != null)
            //右指针调整为指向下一个节点就是自己
            pre.right = root;
        pre = root;

        if(head == null)
            head = root;

        LDR(root.right);
    }
}
