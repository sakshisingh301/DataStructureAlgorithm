package com.company.Arrays;

public class EquilibriumPoint {

    public static int equilibriumPoint(int [] arr)
    {
        if(arr.length==1 || arr.length==2)
            return -1;
     int [] sum=new int [arr.length];
     int total=0;
     for(int i=0;i<arr.length;i++)
     {
         total=total+arr[i];
         sum[i]=total;
     }
     int leftsum=0;
     int rightsum=0;
     for(int i=0;i<arr.length;i++)
     {
         leftsum=sum[i]-arr[i];
         rightsum=sum[arr.length-1]-sum[i];
         if(leftsum==rightsum)
         {
             return i;
         }
     }
    return -1;
    }

    public static void main(String[] args) {
        int A[] = {2,1,-1};
        System.out.println(equilibriumPoint(A));
    }
}
