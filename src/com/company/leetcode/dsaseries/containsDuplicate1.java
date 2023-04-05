package com.company.leetcode.dsaseries;

import java.util.Arrays;

public class containsDuplicate1 {
    public static boolean containsDuplicate(int[] nums) {
        boolean isDuplicate=false;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
         if(nums[i]==nums[i+1])
         {
             count=count+2;
         }
        }
        if(count>=2)
        {
            isDuplicate=true;
        }
     return isDuplicate;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        containsDuplicate(nums);
    }
}
