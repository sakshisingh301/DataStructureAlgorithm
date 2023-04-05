package com.company.Arrays;

public class SortArrayContaining01and2 {

    public static void solution(int [] arr)
    {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(mid<=end)
        {
            switch (arr[mid])
            {
                case 0:
                    int temp=arr[start];
                    arr[start]=arr[mid];
                    arr[mid]=temp;
                    mid++;
                    start++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp1=arr[mid];
                    arr[mid]=arr[end];
                    arr[end]=temp1;
                    end--;
                    mid++;
                    break;

            }
        }

    }
    public static void main(String[] args) {
        int [] arr={0, 2, 1, 2, 0};
        solution(arr);
    }

}
