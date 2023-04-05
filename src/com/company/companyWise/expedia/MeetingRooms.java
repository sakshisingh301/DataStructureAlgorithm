package com.company.companyWise.expedia;

import java.util.Arrays;

public class MeetingRooms {

    public static boolean canAttendMeetings(int[][] intervals) {
        if(intervals.length==1 || intervals.length==0)
            return true;
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));


        int end=intervals[0][1];

        for(int index=1;index<intervals.length;index++)
        {
            int [] curr=intervals[index];
            if(end>curr[0])
            {
              return false;
            }
            else
            {
                end=curr[1];

            }
        }
        return true;



    }

    public static void main(String[] args) {
        int [] [] intervals={{7,10},{2,4}};
        canAttendMeetings(intervals);
    }
}
