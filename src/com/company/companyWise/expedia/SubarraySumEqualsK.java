package com.company.companyWise.expedia;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i< nums.length;i++)
        {
             sum=sum+nums[i];

             if(map.containsKey(sum-k))
             {
                 count=count+map.get(sum-k);
             }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;

    }

    public static void main(String[] args) {
       int [] nums = {1,1,1};
        int k = 2;
        subarraySum(nums,k);
    }
}
