package com.company.leetcode.dsaseries;

public class SingleNumber {

    public static int singleNumber1(int[] nums) {

        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            result^= nums[i];
        }
        return result;

    }

    public static void main(String[] args) {
        int []nums = {2,2,1};
        singleNumber1(nums);
    }
}
