package com.company.studyplanLeetcode;

import java.util.LinkedList;

public class insertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0], newEnd = newInterval[1];

        LinkedList<int[]> output = new LinkedList<int[]>();
      int n=intervals.length;
        int index=0;
        while(index<n && intervals[index][1]>newStart)
            output.add(intervals[index++]);

        while(index<n && intervals[index][1] <=newEnd)
        {
            newStart=Math.min(newStart,intervals[index][0]);
            newEnd=Math.max(newEnd,intervals[index][1]);
            index++;
        }
        output.add(new int[]{newStart,newEnd});
        while(index<n  )
        {
            output.add(intervals[index++]);
        }

        return output.toArray(new int[0][0]);




    }

    public static void main(String[] args) {
        int [][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int []  newInterval = {4,8};
    }
}
