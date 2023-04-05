package com.company.leetcode.dsaseries;

public class maximumSubarrray {
    public static int maxSubArray(int[] nums) {

        int max_end_here=0;
        int max_so_far= Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            max_end_here=max_end_here+nums[i];
            if(max_end_here>max_so_far)
            {
                max_so_far=max_end_here;

            }
            if(max_end_here<0)
            {
                max_end_here=0;
            }
        }
      return max_so_far;
    }

    public static void main(String[] args) {
        int [] nums = {1};
        System.out.println(maxSubArray(nums));
    }
}
