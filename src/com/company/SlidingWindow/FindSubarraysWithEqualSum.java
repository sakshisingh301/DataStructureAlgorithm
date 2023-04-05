package com.company.SlidingWindow;

import java.util.HashSet;

public class FindSubarraysWithEqualSum {
    public static boolean findSubarrays(int[] nums) {

        int window=2;
        HashSet<Integer>  set=new HashSet<>();
        int i=0;
        int j=0;
        int sum=0;
        while(j< nums.length)
        {
          sum=sum+nums[j];
          if(j-i+1<window)
          {
              j++;
          }
          else if(j-i+1==window)
          {
              if(!set.contains(sum))
              {
                  set.add(sum);
              }
              else {
                  return true;
              }
              sum=sum-nums[i];
              i++;
              j++;

          }


        }
        return false;

    }

    public static void main(String[] args) {
        int [] nums = {4,2,4};
        findSubarrays(nums);

    }
}


