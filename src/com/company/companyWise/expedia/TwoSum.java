package com.company.companyWise.expedia;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< nums.length;i++)
        {
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++)
        {
            int complement =target-nums[i];
            if(map.containsKey(complement) &&i!=map.get(complement))
            {
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        return null;

    }

    public static void main(String[] args) {
      int []   nums = {3,3};
       int  target = 6;
       twoSum(nums,target);
    }
}

