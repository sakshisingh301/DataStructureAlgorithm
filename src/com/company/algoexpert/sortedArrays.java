package com.company.algoexpert;

public class sortedArrays {
    public static int[] sortedSquaredArray(int[] array) {
        int [] temp=new int[array.length];
        int start=0;
        int end=array.length;
        int i=array.length;
        while(start<end)
        {
            if(array[start]*array[start]<=array[end]*array[end])
            {
                temp[i]=array[end]*array[end];
                end--;
                i--;
            }
            else if(array[start]*array[start]>array[end]*array[end])
            {
                temp[i]=array[start]*array[start];
                start++;
                i--;
                }
        }
        return temp;

    }
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7,8,9};

    }
}
