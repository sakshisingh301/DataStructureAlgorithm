package com.company.AlgorthmII;

public class PeakElement {
 // first check if mid is a peak element or not , if yes then return , if not then we have to move either left or right and if mid+1>mid then move right else left
    public static int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        if(nums[nums.length-1]>nums[nums.length-2])
        {
            return nums.length-1;
        }
        if(nums[0]>nums[1])
        {
            return 0;
        }

        int start=0;
        int end=nums.length-2;


        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
            {
                return mid;
            }
            else if(nums[mid]<nums[mid+1])
            {
                start=mid+1;
            }
            else if(nums[mid]<nums[mid-1])
            {
                end=mid-1;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int [] nums={1,2,1,3,5,6,4};

    }
}
