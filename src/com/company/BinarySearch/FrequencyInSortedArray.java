package com.company.BinarySearch;

public class FrequencyInSortedArray {

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
         int arr[] = {1, 1, 2, 2, 2, 2, 3};
         int x=2;
         int last=lastOccurence(arr,x);
         int first=firstOccurence(arr,x);
         System.out.println(last-first+1);
    }
}
