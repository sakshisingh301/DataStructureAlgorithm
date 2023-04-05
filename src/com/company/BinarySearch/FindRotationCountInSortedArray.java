package com.company.BinarySearch;

public class FindRotationCountInSortedArray {

    public static int solution(int [] arr)
    {
        int result=-1;
        int start=0;
        int end=arr.length-1;
        if(arr[start]<arr[end] || arr.length==1)
        {
            return 0;
        }
        while(start<=end)
        {

            int mid=start+(end-start)/2;
            if(mid==arr.length-1 ||mid==0||arr[mid]<arr[mid-1] && arr[mid] <arr[mid+1])
            {
                result=mid;
                if(result==0)
                    result++;
                break;
            }
            else if(arr[mid]>=arr[start] && arr[mid]>=arr[end])
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
        int arr[] = {1,2,3,4,5};
        System.out.println(solution(arr));

    }
}
