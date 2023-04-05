package com.company.studyplanLeetcode;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int found=-1;
        int length=nums.length;
        int start=0;
        int end =nums.length-1;
        while(start<end)
        {
            int mid=start+end-start/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                found=mid;
            }

        }

  return found;


    }

    public static void main(String[] args) {
        int [] nums={-1,0,3,5,9,12};
        int target=9;
        search(nums,target);
    }
}
