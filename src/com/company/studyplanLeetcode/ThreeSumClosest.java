package com.company.studyplanLeetcode;

import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        int i=0;

        int sum=0;
        int min= Integer.MAX_VALUE;
        int dif=0;
        int result=0;
        Arrays.sort(nums);
        while(i<nums.length-2)
        {
            int start=i+1;
            int end=nums.length-1;
            while(start<end) {
            sum=nums[i]+nums[start]+nums[end];
            dif=target-sum;
            dif=Math.abs(dif);
            if(dif<min)
            {
                min=dif;
                result=sum;
            }
                if (sum > target) {
                    end--;
                } else if (sum < target) {
                    start++;
                } else {
                    start++;
                    end--;
                }
            }
            i++;

        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,0};

        int target =-100 ;
        threeSumClosest(nums,target);
    }
}
