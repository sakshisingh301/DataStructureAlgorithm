package com.company.AlgorthmII;

public class FindFirstandLastPositionofElementInSortedArray {
 //find the target element first then based on the what we want to find out we have to move the pointer ,
    public static int[] searchRangeMethod1(int[] nums, int target) {

        int begin=solution(nums,target,true);
        if(begin==-1)
        {
           return new int[]{-1,-1};
        }
        int ends=solution(nums,target,false);

  return new int []{begin,ends};
    }

    public static int solution(int [] nums,int target,Boolean isFirst)
    {
        int start=0;
        int end=nums.length-1;
        int element=-1;
        while(start<=end)
        {
         int mid=start+(end-start)/2;
         if(nums[mid]<target)
         {
             start=mid+1;
         }
         else if(nums[mid]>target)
         {
             end=mid-1;
         }
         else
         {
             if(isFirst)
             {
                 if(mid==start||nums[mid-1]!=nums[mid])
                 {
                    element=mid;
                    return element;
                 }
                 end=mid-1;
             }
             else
             {
                 if(mid==end||nums[mid+1]!=nums[mid])
                 {
                     element=mid;
                     return element;
                 }
                 start=mid+1;
             }
         }
        }
        return element;
    }








    public static void main(String[] args) {

      int []  nums = {1};
      int target = 1;
      searchRangeMethod1(nums,target);


    }
}
