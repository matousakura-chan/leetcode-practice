package com.chen.SwordForOffer.ThreeThree;

public class Solution {

    public boolean verifyPostorder(int[] postorder) {

        return verify(postorder,0, postorder.length-1);

    }

    public boolean verify(int[] postorder,int star,int root){
        if(root - star <=1) return true;
        int i = star;
        //左子树
        for (; i < root ; i++) {
            if(postorder[i]>postorder[root])
                break;
        }
        int leftTreeSize = i - 1;
        for (; i < root ; i++){
            if(postorder[i]<postorder[root])
                return false;
        }
        return verify(postorder,star,leftTreeSize)&&verify(postorder,leftTreeSize+1,root - 1);
    }
}
