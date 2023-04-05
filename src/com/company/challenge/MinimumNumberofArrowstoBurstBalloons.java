package com.company.challenge;

import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons {

    public static int findMinArrowShots(int[][] points) {
        int minimumShots=1;
        Arrays.sort(points, (i1, i2) -> Integer.compare(i1[1], i2[1]));
        int endprev=points[0][1];
        for(int i=1;i< points.length;i++)
        {
            int [] curr=points[i];
            int start=curr[0];
            int end=curr[1];
            if(endprev<start)
            {
                minimumShots++;
            }
            endprev=end;



        }
        return minimumShots;



    }


    public static void main(String[] args) {
        int [] [] points = {{10,16},{2,8},{1,6},{7,12}};
        //{{1,6},{2,8},{7,12},{10,16}}

    }
}
