package com.company.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        findSubsets(0,nums,ans,new ArrayList<>());
        return ans;

    }

    private void findSubsets(int index, int[] nums, List<List<Integer>> ans, ArrayList<Integer> temp) {
        ans.add(new ArrayList<>(temp));

        for(int i=index;i<nums.length;i++)
        {
            temp.add(nums[i]);
            findSubsets(i+1,nums,ans,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {

    }
}
