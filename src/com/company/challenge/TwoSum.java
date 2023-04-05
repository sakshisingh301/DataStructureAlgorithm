package com.company.challenge;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int key=target-nums[i];
            if(map.containsKey(key) && map.get(key)!=i)
            {
                return new int[]{i,map.get(key)};
            }
        }
        return null;


    }

    public static void main(String[] args) {
        int []  nums = {2,7,11,15};
        int target = 9;
    }
}
