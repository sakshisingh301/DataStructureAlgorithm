package com.company.Arrays;

public class MonotonicArray1 {

    public static boolean isMonotonic(int[] nums) {
        boolean increasing=true;
        boolean decreasing=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                increasing=false;
            }
            if(nums[i]<nums[i+1])
            {
                decreasing=false;
            }
        }
        return increasing || decreasing;

    }
    public static void main(String[] args) {
       int [] nums = {1,3,2};
       isMonotonic(nums);

    }
}
