package com.company.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {

    public static ArrayList solution(int [] a, int sum)
    {
        final int originalSum=sum;
        ArrayList<Integer> arrayList=new ArrayList<>();
       for(int i=0;i<a.length-1;i++)
       {
           for(int j=i;j<a.length;)
           {
               sum=sum-a[j];
              if(sum>0)
              {
                  j++;
              }
              else if(sum<0)
              {
                  sum=originalSum;
                  break;
              }
              else
              {
                  arrayList.add(i);
                  arrayList.add(j);
                 return arrayList;
              }

           }
       }
        return arrayList;
    }

    //sliding window
    public static ArrayList optimalSolution(int [] a,int sum)
    {
        int curr_sum=0;
        int j=0;
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<a.length;)
        {

            if(curr_sum<sum)
            {
                curr_sum=curr_sum+a[i];
                i++;
            }
            else if(curr_sum>sum)
            {
                curr_sum=curr_sum-a[j];
                j++;
            }
            else
            {
                if(i==0 && j==0)
                {
                    System.out.println("no subarray found");
                    break;
                }
               arrayList.add(j);
               arrayList.add(i-1);
               break;
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
       int[] a = {1, 4};
       int sum = 0;
       //System.out.println(solution(a,7));
        System.out.println(optimalSolution(a,sum));
    }
}
