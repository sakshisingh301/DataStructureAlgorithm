package com.company.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class smallestKthElement {

    public static int solution(int [] arr, int k)
    {
        PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int x: arr)
        {
            max_heap.add(x);
            if(max_heap.size()>k)
            {
                max_heap.poll();
            }
        }
        if(!max_heap.isEmpty())
        return max_heap.peek();
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k=3;
        System.out.println(solution(arr,k));
    }
}
