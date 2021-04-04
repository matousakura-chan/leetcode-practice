package com.chen.leetcode.SevenSix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public String minWindow(String s, String t) {

        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();

        int l = 0;
        int r = -1;
        int star = 0;
        int end = 0;
        int length = Integer.MAX_VALUE;
        int need = ct.length;
        int now = 0;

        HashMap<Character, int[]> map = new HashMap<>(); //记录

        for(char a:ct){
            if(map.containsKey(a))
                map.get(a)[0] = map.get(a)[0]+1;
            else {
                int [] temp = new int[]{1,0};
                map.put(a,temp);
            }
        }

        while (r < cs.length-1){
            //向前移动
            r++;
            if(map.containsKey(cs[r])){
                map.get(cs[r])[1] ++;
                now += map.get(cs[r])[0]>=map.get(cs[r])[1]?1:0;
            }
            //满向后移动
            if(now == need){
                //多余或多了
                while (!map.containsKey(cs[l])||map.get(cs[l])[0]<map.get(cs[l])[1]) {
                    if(map.containsKey(cs[l])){  //减掉多余的
                        map.get(cs[l])[1] --;
                    }
                    l++;
                }
                length = Math.min(length,r-l);
                if(length == r - l){  //更新最短
                    star = l;
                    end = r;
                }
                System.out.println("out" + l + "---" + r +"---"+now);
                map.get(cs[l])[1]--;
                //now-=map.get(cs[l])[0]>map.get(cs[l])[1]?1:0;
                now--;
                l++;
            }

        }
        return star != -1?s.substring(star,end+1):"";
        }
}

