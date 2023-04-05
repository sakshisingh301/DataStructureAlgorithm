package com.company.companyWise.expedia;

import java.util.Arrays;

public class MeetingRoomsII {

    public static int minMeetingRooms(int[][] intervals) {
       int [] start=new int[intervals.length];
       int [] end=new int[intervals.length];
       for(int i=0;i<intervals.length;i++)
       {
           start[i]=intervals[i][0];

       }
       Arrays.sort(start);
       for(int i=0;i<intervals.length;i++)
       {
           end[i]=intervals[i][1];
       }
       Arrays.sort(end);
       int p1=0;
       int p2=0;
       int count=0;
       int res=0;
       while (p1<start.length)
       {
           if(start[p1]<end[p2])
           {
               p1++;
               count++;
           }
           else
           {
               p2++;
               count--;
           }
           res=Math.max(res,count);
       }
       return res;

    }

    public static void main(String[] args) {
        int [] [] interval={{0,30},{5,10},{15,20}};
        System.out.println(minMeetingRooms(interval));

    }
}
