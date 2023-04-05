package com.company.studyplanLeetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (int i=0;i<stones.length;i++)
        {
            max_heap.add(stones[i]);
        }
       ;
        while(max_heap.size()>=2)
        {
           int y=max_heap.poll();
           int x=max_heap.poll();
           int temp=y-x;
           max_heap.add(temp);

        }
        if(!max_heap.isEmpty())
     return max_heap.peek();
        else
            return 1;

    }

    public static void main(String[] args) {
        int [] stones={2,2};
        lastStoneWeight(stones);
    }
}
