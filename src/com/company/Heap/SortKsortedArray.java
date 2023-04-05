package com.company.Heap;

import java.math.BigInteger;
import java.util.PriorityQueue;

public class SortKsortedArray {

    public static int[] sort(int [] arr, int k)
    {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        int [] temp=new int[arr.length];
        int p=0;
        for (int i=0;i<arr.length;i++)
        {
            min_heap.add(arr[i]);
            if(min_heap.size()>k && min_heap.size()>0)
            {

               temp[p]=min_heap.poll();
               p++;
            }

        }
        if(p!= arr.length)
        {
            while(!min_heap.isEmpty())
            {
                temp[p]=min_heap.poll();
                p++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int k=3;
        sort(arr,k);

    }
}
