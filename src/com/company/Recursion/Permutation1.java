package com.company.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation1 {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();
        Boolean [] visited=new Boolean[nums.length];
        for(int i=0;i<visited.length;i++)
        {
            visited[i]=false;
        }
        findPermutaion(nums,ans,new ArrayList<>(),visited);
        return ans;

    }

    private void findPermutaion( int[] nums, List<List<Integer>> ans, ArrayList<Integer> temp, Boolean[] visited) {
       if(temp.size()==nums.length)
       {
           ans.add(new ArrayList<>(temp));
           return;
       }


        for(int i=0;i<nums.length;i++)
        {
            if(!visited[i])
            {
               temp.add(nums[i]);
               visited[i]=true;
               findPermutaion(nums,ans,temp,visited);
               temp.remove(temp.size()-1);
               visited[i]=false;
            }
        }
    }

    public static void main(String[] args) {

    }
}
