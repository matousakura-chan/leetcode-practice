package com.chen.SwordForOffer.FourOne;

import java.util.PriorityQueue;

class MedianFinder {

    /* 大顶堆，存储左半边元素 */
    private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
    /* 小顶堆，存储右半边元素，并且右半边元素都大于左半边 */
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    /* 当前数据流读入的元素个数 */
    private int N = 0;

    /** initialize your data structure here. */
    public MedianFinder() {
    }

    public void addNum(int num) {

        if(N%2 == 0){
            right.offer(num);
            left.offer(right.poll());
        }else {
            left.offer(num);
            right.offer(left.poll());
        }
        N++;
    }

    public double findMedian() {

        if(left.isEmpty()&&right.isEmpty()) return -1;
        if(left.size()> right.size()) return left.peek();
        else return ((double) left.peek()+ (double)right.peek())/2;

    }
}
