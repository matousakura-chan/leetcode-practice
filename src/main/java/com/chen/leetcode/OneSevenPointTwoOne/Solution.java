package com.chen.leetcode.OneSevenPointTwoOne;

public class Solution {

    private int[] root = null;
    private boolean[] flag = null;
    private int length = 0;
    private int volume = 0;

    public int trap(int[] height) {

        UnionFind(height);
        int black = -1;
        for (int i = 0; i < length; i++) {
            if(flag[i]){
                if (black == -1) black = i;
                else union(i,black);
            }
        }

        for (int i = 0; i < length; i++) {
            if(!flag[i]){
                int l = i-1;
                int r = i+1;
                int left = i/height.length*height.length-1;
                int right = i/height.length*height.length+height.length;
                while (l>left&&!flag[l]) l--;
                while (r<right&&!flag[r]) r++;

                if(l>left&&r<right&&flag[r]&flag[l]){
                    while (l!=r){
                        unionVolume(l+1,l++);
                        flag[l] = true;
                    }
                }
            }
        }

//        for (int i = 0; i < flag.length; i++) {
//            if(i%height.length == 0) System.out.println();
//                System.out.print(flag[i]?flag[i]+"  ":flag[i]+" ");
//        }
//        for (int i = 0; i < root.length; i++) {
//            if(i%height.length == 0) System.out.println();
//             System.out.print(root[i]+" ");
//        }
        return volume;
    }

    public void UnionFind(int [] target){
        int max = 0;
        for(int t:target){
            max = Math.max(t,max);
        }

        root = new int[target.length*max];
        flag = new boolean[target.length*max];
        length = root.length;
        for(int i= 0;i<root.length;i++){
            root[i] = i;
        }
        for(int i= 0;i<target.length;i++){
            for (int j = 0; j < target[i]; j++) {
                flag[j*target.length+i] = true;
            }
        }
    }
    public int find(int x){
        if(x == root[x]){
            return root[x];
        }
        return find(root[x]);
    }
    public void union(int x,int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX != rootY){
            root[rootX]=rootY;
        }
    }
    public void unionVolume(int x,int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX != rootY){
            root[rootX]=rootY;
            volume++;
        }
    }
}
