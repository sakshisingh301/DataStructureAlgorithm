package com.company.leetcode.dsaseries;

public class SubarrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int i=0;
        int product=1;
       for(int j=0;j<nums.length;j++)
       {
           product=product*nums[j];
           while(product>=k)
           {
               product=product/nums[i];
               i++;
           }
           count=count+j-i+1;
       }
        return count;

    }
    public static void main(String[] args) {
        int [] nums = {10,5,2,6};
        int k = 100;
        numSubarrayProductLessThanK(nums,k);
    }
}
