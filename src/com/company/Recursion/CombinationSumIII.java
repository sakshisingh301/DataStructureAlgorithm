package com.company.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            nums.add(i+1);
        }
        findCombinationSum(0,new ArrayList<>(),ans,k,n,n,nums);
        return ans;


    }

    private void findCombinationSum(int index, List<Integer> temp, List<List<Integer>> ans, int k, int target,int length,List<Integer> nums) {
       if(temp.size()==k)
       {
           ans.add(new ArrayList<>(temp));
           return;
       }

        for(int i=index;i<length;i++)
        {
            temp.add(nums.get(i));
            findCombinationSum(index+1,temp,ans,k,target-nums.get(i),length,nums);
            temp.remove(temp.size()-1);
        }

    }

    public static void main(String[] args) {

    }
}
