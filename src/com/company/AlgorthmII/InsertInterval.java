package com.company.AlgorthmII;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        int index=0;
        int n=intervals.length;
        List<int []> result=new ArrayList<>();
        int newStart=newInterval[0];
        int newEnd=newInterval[1];

        while(index<n &&newStart>intervals[index][1] )
        {
            result.add(intervals[index++]);
        }

        while(index<n && intervals[index][0]<newEnd)
        {
            newStart=Math.min(intervals[index][0],newStart);
            newEnd=Math.max(intervals[index][1],newEnd);
            index++;
        }
        result.add(new int[]{newStart,newEnd});
        while(index<n)
        {
            result.add(intervals[index++]);
        }
        return result.toArray(new int[0][0]);


    }

    public static void main(String[] args) {
        int [] []intervals={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval={4,8};
    }
}
