package com.company.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        findSubset(0,nums,ans,new ArrayList<>());
        return ans;

    }

    private void findSubset(int index, int[] nums, List<List<Integer>> ans, ArrayList<Integer> temp) {
        ans.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++)
        {
            if( nums[i]==nums[i-1]) break;
            temp.add(nums[i]);
            findSubset(i+1,nums,ans,temp);
            temp.remove(temp.size()-1);
        }


    }

    public static void main(String[] args) {

    }
}
