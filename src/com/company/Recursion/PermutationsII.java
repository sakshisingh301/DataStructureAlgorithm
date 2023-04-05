package com.company.Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {

        Set<List<Integer>> ans=new HashSet<>();
        boolean [] visited=new boolean[nums.length];
        findPermutation(nums,ans,new ArrayList<>(),visited);
        List<List<Integer>> result=new ArrayList<>(ans);


        return result;

    }

    private void findPermutation(int[] nums, Set<List<Integer>> ans, ArrayList<Integer> temp,boolean [] visited) {

        if(temp.size()== nums.length)
        {
            ans.add(new ArrayList<>(temp));
        }
        for(int i=0;i< nums.length;i++)
        {
            if(!visited[i])
            {
                visited[i]=true;
                temp.add(nums[i]);
                findPermutation(nums,ans,temp,visited);
                temp.remove(temp.size()-1);
                visited[i]=false;
            }
        }



    }

    public static void main(String[] args) {

    }
}
