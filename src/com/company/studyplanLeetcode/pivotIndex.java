package com.company.studyplanLeetcode;

public class pivotIndex {

    public static int pivotIndex(int[] nums) {
        int pivotIndex=-1;
        int [] prefixSum=new int[nums.length];
        if(nums.length==2)
            return -1;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            prefixSum[i]=sum;
        }
        int leftSum=0;
        int rightSum=0;

        for (int i=0;i<nums.length;i++)
        {
            leftSum=prefixSum[i]-nums[i];
            rightSum=prefixSum[prefixSum.length-1]-prefixSum[i];
            if(leftSum==rightSum) {
                pivotIndex = i;
                break;
            }
        }
        return pivotIndex;
    }

    public static void main(String[] args) {
        int [] a={2,1,-1};
        System.out.println(pivotIndex(a));
    }
}
