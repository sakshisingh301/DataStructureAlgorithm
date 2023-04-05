package com.company.studyplanLeetcode;

public class RunningSumOf1dArray {

    public static int[] runningSum(int[] nums) {
        int [] temp=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            temp[i]=sum;
        }
        return temp;


    }

    public static void main(String[] args) {
        int [] a={1,2,3,4};
        runningSum(a);


    }
}
