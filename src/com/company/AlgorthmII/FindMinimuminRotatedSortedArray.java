package com.company.AlgorthmII;

public class FindMinimuminRotatedSortedArray {

    public static int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;

       while(nums[start]>nums[end])
       {
           int mid=start+(end-start)/2;
           if(nums[mid]>=nums[start])
           {
               start=mid+1;
           }
           else
           {
               end=mid;
           }
       }
     return nums[start];
    }

    public static void main(String[] args) {
        int [] nums={4,5,6,7,0,1,2};//{1,2,3,4,5}
        findMin(nums);

    }
}
