package com.company.companyWise.expedia;

import java.util.*;


public class carPooling {

    public  static boolean carPooling(int[][] trips, int capacity) {
        int tempCapacity=capacity;

        //Queue<int []> queue=new LinkedList<>();
        Arrays.sort(trips, Comparator.comparing(trip -> trip[1]));
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(trip -> trip[2]));//{end,numofpassenger}

        for(int [] trip:trips)
        {
            int [] curr=trip;
            if(!pq.isEmpty()) {
                int temp = pq.peek()[2];
            }

            while(!pq.isEmpty() && pq.peek()[2]<=curr[1])
            {
                capacity=capacity+pq.peek()[0];
                pq.poll();

            }
           capacity=capacity-curr[0];
            if(capacity<0)
            {
                return false;
            }

            pq.add( curr);


        }


     return true;






    }

    public static void main(String[] args) {
        int [] [] trips = {{2,1,5},{1,2,3},{3,3,7}};
        int capacity = 4;
        carPooling(trips,capacity);
    }
}
