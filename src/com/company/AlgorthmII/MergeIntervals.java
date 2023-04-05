package com.company.AlgorthmII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
//    public static int[][] merge(int[][] intervals) {
//        int index=0;
//        if(intervals.length==1)
//            return intervals;
//
//        List<int []> result=new ArrayList<>();
//        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
//        int [] temp=intervals[0];
//       index++;
//       while(index< intervals.length)
//       {
//           int start=temp[0];
//           int end=temp[1];
//          int currStart=intervals[index][0];
//          int currEnd=intervals[index][1];
//          if(end>=currStart)
//          {
//              start=Math.min(start,currStart);
//              end=Math.max(end,currEnd);
//
//              temp[0]=start;
//              temp[1]=end;
//
//          }
//          else {
//              if(result.isEmpty())
//              {
//                  result.add(new int[]{start,end});
//              }
//              result.add(new int[]{currStart,currEnd});
//              temp[0]=currStart;
//              temp[1]=currEnd;
//
//          }
//           result.add(new int[]{start,end});
//
//           index++;
//       }
//
//    return result.toArray(new int[result.size()][2]);
//
//
//
//    }

    public static int[][] merge(int[][] intervals)
    {
        if(intervals.length<=1) return intervals;
        List<int []> result=new ArrayList<>();
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        result.add(intervals[0]);

    for(int i=1;i< intervals.length;i++)
    {
        int [] curr=intervals[i];
        int size= result.size();
        int [] lastInterval= result.get(size-1);
        if(lastInterval[1]>=curr[0])
        {
            result.remove(size-1);
            result.add(new int []{Math.min(curr[0],lastInterval[0]),Math.max(curr[1],lastInterval[1])}); // no need to take minimum between the curr[0],lastInterval[0] because the array is sorted and lastInterval[0] will be minimum always

        }
        else
        {
            result.add(curr);
        }
    }


        return result.toArray(new int[result.size()][2]);
    }

    public static void main(String[] args) {
        int [] [] intervals = {{1,4},{0,2},{3,5}};
        merge(intervals);

    }
}
