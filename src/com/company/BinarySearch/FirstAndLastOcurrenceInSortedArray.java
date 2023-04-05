package com.company.BinarySearch;

import java.util.ArrayList;

public class FirstAndLastOcurrenceInSortedArray {

    public static Integer firstOccurence(int [] arr, int x)
    {
       int start=0;
       int end=arr.length;
       int result=-1;
       while(start<=end)
       {
           int mid=start + (end-start)/2;
           if(arr[mid]==x)
           {
             result=mid;
             end=mid-1;
           }
           else if(arr[mid]<x)
           {
               start=mid+1;
           }
           else
           {
               end=mid-1;
           }
       }
       return result;

    }

    public static Integer lastOccurence(int [] arr, int x)
    {
        int start=0;
        int end=arr.length;
        int result=-1;
        while(start<=end)
        {
            int mid=start + (end-start)/2;
            if(arr[mid]==x)
            {
                result=mid;
                start=mid+1;
            }
            else if(arr[mid]<x)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x=5;
        int firstOccurance=firstOccurence(arr,x);
        int lastOccurence=lastOccurence(arr,x);
       if(firstOccurance==-1 )
       {
           System.out.println("NO FIRSTOCCURANCE INDEX FOUND");
       }
       else
       {
           System.out.println(firstOccurance);
       }

        if(lastOccurence==-1 )
        {
            System.out.println("NO lastOccurence INDEX FOUND");
        }
        else
        {
            System.out.println(lastOccurence);
        }
    }
}
