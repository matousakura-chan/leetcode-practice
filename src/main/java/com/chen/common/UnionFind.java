package com.chen.common;

public class UnionFind {

    private int[] root = null;

    public UnionFind(int [] target){
        root = new int[target.length];
        for(int i= 0;i<target.length;i++){
            root[i] = i;
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
}
