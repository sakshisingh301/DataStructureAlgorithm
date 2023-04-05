package com.company.leetcode.dsaseries;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer, Integer> set=new HashMap<>();

        for(int x:nums)
        {
            set.put(x,1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(set.containsKey(target-nums[i]) && set.get(target-nums[i])!=i)
            {
             return new int[]{i,set.get(target-nums[i])};
            }
        }
      return null;

    }

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
    }
}
