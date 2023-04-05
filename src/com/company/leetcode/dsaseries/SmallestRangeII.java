package com.company.leetcode.dsaseries;

import java.util.Arrays;

public class SmallestRangeII {

    public static int smallestRangeII(int[] nums, int k) {

        int j=0;
        if(nums.length==1)return 0;
        Arrays.sort(nums);
        int x=nums[nums.length-1];
        int y=nums[0];
        int smallestRange=x-y;

        for(int i=0;i<nums.length-1;i++)
        {
            int [] temp=new int[nums.length];
            while(j<=i) {
                temp[j] = nums[j] + k;
                j++;
            }
            while(j<nums.length)
            {
                temp[j]=nums[j]-k;
                j++;
            }
            Arrays.sort(temp);

            int diff=temp[temp.length-1]-temp[0];
            if(diff<smallestRange)
            {
                smallestRange=diff;
            }
            j=0;


        }

return smallestRange;



    }



    public static void main(String[] args) {

        int [] nums = {7,8,8};
        int k = 5;
        smallestRangeII(nums,k);

    }
}
