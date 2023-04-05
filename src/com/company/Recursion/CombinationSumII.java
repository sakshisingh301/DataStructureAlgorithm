package com.company.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSumII {


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        findCombinationSum(0,target,candidates,ans,new ArrayList<>());

        return ans;

    }

    private void findCombinationSum(int index, int target, int[] candidates, List<List<Integer>> ans, ArrayList<Integer> temp) {

        if(target==0)
        {
            ans.add(new ArrayList<>(temp));
        }
        for(int i=index;i<candidates.length;i++)
        {
            if(i>index && candidates[i]==candidates[i-1])
                continue;
            if(candidates[i]>target)
            {
                break;
            }
            temp.add(candidates[i]);
            findCombinationSum(i+1, target-candidates[index],candidates,ans,temp);
            temp.remove(temp.size()-1);
        }

    }

    public static void main(String[] args) {

    }
}
