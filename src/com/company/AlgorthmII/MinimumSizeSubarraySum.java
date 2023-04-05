package com.company.AlgorthmII;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {

        int i=0;
        int j=0;
        int sum=0;
        int min= Integer.MAX_VALUE;

        while(j<nums.length)
        {

           sum=sum+nums[j];
           if(sum>=target )
           {
               while (sum>=target)
               {
                   min=Math.min(min,j-i+1);
                   sum=sum-nums[i];
                   i++;
               }
               j++;
           }
           else if(sum<target)
           {

               j++;

           }


        }
        return (min==Integer.MAX_VALUE)?0:min;


    }

    public static void main(String[] args) {
        int [] nums={2,3,1,2,4,3};
        int target=7;
        minSubArrayLen(target,nums);
    }
}
