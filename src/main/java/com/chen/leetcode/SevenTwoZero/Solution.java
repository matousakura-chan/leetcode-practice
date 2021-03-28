package com.chen.leetcode.SevenTwoZero;

import java.util.*;

public class Solution {
    public String longestWord(String[] words) {

        int maxSize = 0;
        PriorityQueue<String> queue = new PriorityQueue<>((str1,str2)->{
            if(str1.length() > str2.length()) return -1;
            else if(str1.length() < str2.length()) return 1;
            else return str1.compareTo(str2);
        });

        Trie trie = new Trie();
        for (String word:words){
            trie.insert(word);
        }
        for (String word:words){
            boolean flag = true;
            for (int i = 1; i < word.length(); i++) {
                if(!trie.search(word.substring(0,i))){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                queue.remove(word.substring(0,word.length()-1));
                queue.offer(word);
            }
        }
        return queue.peek();
    }

}
class Trie {
    private boolean is_string=false;
    private Trie next[]=new Trie[26];

    public Trie(){}

    public void insert(String word){//插入单词
        Trie root=this;
        char w[]=word.toCharArray();
        for(int i=0;i<w.length;++i){
            if(root.next[w[i]-'a']==null)root.next[w[i]-'a']=new Trie();
            root=root.next[w[i]-'a'];
        }
        root.is_string=true;
    }

    public boolean search(String word){//查找单词
        Trie root=this;
        char w[]=word.toCharArray();
        for(int i=0;i<w.length;++i){
            if(root.next[w[i]-'a']==null)return false;
            root=root.next[w[i]-'a'];
        }
        return root.is_string;
    }

    public boolean startsWith(String prefix){//查找前缀
        Trie root=this;
        char p[]=prefix.toCharArray();
        for(int i=0;i<p.length;++i){
            if(root.next[p[i]-'a']==null)return false;
            root=root.next[p[i]-'a'];
        }
        return true;
    }
}