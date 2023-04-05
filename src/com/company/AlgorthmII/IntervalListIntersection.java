package com.company.AlgorthmII;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersection {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        int length1=firstList.length;
        int length2=secondList.length;
        int i=0;
        int j=0;
        int startMax=0;
        int endMin=0;
        List<int []> result=new ArrayList<>();

        while(i<length1 && j<length2)
        {
          startMax=Math.max(firstList[i][0],secondList[j][0]);
          endMin=Math.min(firstList[i][1],secondList[j][1]);
          if(endMin>=startMax)
          {
              result.add(new int[]{startMax,endMin});
          }
          if(endMin==firstList[i][1])
          {
              i++;
          }
          if(startMax==secondList[j][1])
          {
              j++;
          }
        }
     return result.toArray(new int[result.size()][2]);


    }

    public static void main(String[] args) {
     int [] [] firstList = {{0,2},{5,10},{13,23},{24,25}};
     int [] [] secondList = {{1,5},{8,12},{15,24},{25,26}};

    }
}
