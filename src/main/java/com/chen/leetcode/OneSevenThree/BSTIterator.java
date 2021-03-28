package com.chen.leetcode.OneSevenThree;

import com.chen.common.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BSTIterator {

    List<Integer> list;
    Iterator<Integer> iterator;

    public BSTIterator(TreeNode root) {

        list = new ArrayList<>();
        search(root,list);
        iterator = list.iterator();
    }

    public void search(TreeNode root,List<Integer> list){
        if(root.left!=null) search(root.left,list);
        if(root!=null) list.add(root.val);
        if(root.right!=null) search(root.right,list);
    }

    public int next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }
}
