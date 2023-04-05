package com.company.Heap;

import java.math.BigInteger;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> min_heap = new PriorityQueue<>();
        for(String x: nums)
        {
            BigInteger bigInteger=new BigInteger(x);
            min_heap.offer(bigInteger);
            if(min_heap.size()>k)
            {
                min_heap.poll();
            }
        }

        return String.valueOf(min_heap.peek());

    }

    public static void main(String[] args) {
       String [] nums = {"623986800","3","887298","695","794","6888794705","269409","59930972","723091307","726368","8028385786","378585"};
        int k = 11;
        System.out.println(kthLargestNumber(nums,k));
    }
}
