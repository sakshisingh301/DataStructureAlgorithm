package com.company.DSA;

import java.util.Arrays;
// whenever you have to check if the intervals are overlapping then prev[end]>curr[start] , check mentioned condition

public class NonOverlappingIntervals {

    public static int eraseOverlapIntervals(int[][] intervals) {
        int eraseCount=0;
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        int prevEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            int [] curr=intervals[i];
            if(prevEnd>curr[0])
            {
                eraseCount++;
                prevEnd=Math.min(curr[1],prevEnd);
            }
            else
            {
                prevEnd=curr[1];
            }

        }





        return eraseCount;



    }

    public static void main(String[] args) {

     int [] [] intervals= {{1,2},{1,2},{1,2}};
        //{1,2  1,3  2,3  3,4}
     eraseOverlapIntervals(intervals);

    }
}
