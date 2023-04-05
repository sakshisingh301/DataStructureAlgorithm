package com.company.studyplanLeetcode;

import java.util.ArrayList;

public class mergeIntervals {

    public static int[][] merge(int[][] intervals) {
        int [] visited=new int[intervals.length];
        int k=0;
        int index=0;
        int newStart=0;
        int newStartIndex=0;
        int newEndIndex=1;
        int newEnd=0;
        if(intervals.length==1)
        {
            return intervals;
        }
        ArrayList<int[]> output = new ArrayList<int[]>();
        int n=intervals.length-1;

        while(index<n && intervals[index][1]>=intervals[index+1][0])
        {
            newStart=intervals[index][0];
            newEnd=intervals[index+1][1];
            visited[k]=intervals[index][0];
            k++;
            visited[k]=intervals[index+1][0];
            k++;
            index++;
            output.add(new int[]{newStart,newEnd});
        }

        while(index<n && intervals[index][1]<intervals[index+1][0])
        {

            if(visited[index]!=intervals[index][0]) {
                output.add(new int[]{intervals[index][0], intervals[index][1]});

            }
            index++;
        }
        return output.toArray(new int[0][0]);

    }

    public static void main(String[] args) {
        int [] [] intervals={{1,3},{2,6},{8,10},{15,18}};
        merge(intervals);
    }
}
