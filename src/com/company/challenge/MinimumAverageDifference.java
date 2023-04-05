package com.company.challenge;

public class MinimumAverageDifference {

    public static int minimumAverageDifference(int[] nums) {
        if(nums.length==1)
            return 0;
        int sum=0;
        int leftSum=0;
        int rightSum=0;
        int diffMin=Integer.MAX_VALUE;
        int index=-1;

        int [] prefixSum=new int[nums.length];
        for(int i=0;i< nums.length;i++)
        {
            sum=sum+nums[i];
            prefixSum[i]=sum;
        }

        for(int i=0;i< nums.length;i++)
        {
           leftSum=(prefixSum[i])/(i+1);
           int temp=prefixSum[prefixSum.length-1]-prefixSum[i];
           int temp2= nums.length-1-i;
                   if(temp2==0)
                   {
                       temp2=nums.length-1;
                   }
           rightSum=temp/temp2;
           int diff=Math.abs(Math.abs(leftSum)-Math.abs(rightSum));
           if(diff<diffMin)
           {
               index=i;
               diffMin=diff;
           }




        }
        return index;




    }

    public static void main(String[] args) {
        int [] nums = {2,5,3,9,5,3};
        minimumAverageDifference(nums);
    }
}
