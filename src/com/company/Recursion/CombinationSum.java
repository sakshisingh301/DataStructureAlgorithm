package com.company.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans=new ArrayList<>();
        findCombination(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }

    private void findCombination(int index, int target, int[] candidates, List<List<Integer>> ans, ArrayList<Integer> temp) {

        if(index==candidates.length-1)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(temp));
            }
            return;

        }

        if(candidates[index]<=target)
        {
            temp.add(candidates[index]);
            findCombination(index,target-candidates[index],candidates,ans,temp);
            temp.remove(temp.size()-1);
        }
        findCombination(index+1,target,candidates,ans,temp);
    }

    public static void main(String[] args) {

    }
}
