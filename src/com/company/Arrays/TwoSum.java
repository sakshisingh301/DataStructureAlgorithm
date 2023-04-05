package com.company.Arrays;

import java.util.HashMap;

public class TwoSum {

    public static int [] twosum(int [] nums, int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i]))
            {
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        return null;

    }
    public static void main(String[] args) {
        int [] nums={3,2,4};
        int target=6;
       twosum(nums,target);

    }
}
