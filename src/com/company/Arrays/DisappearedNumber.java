package com.company.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DisappearedNumber {

    public static List<Integer> solve(int[] nums) {
        List<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hashSet.add(nums[i]);
        }

        int value=1;
        for(int i=0;i<nums.length;i++)
        {
            if(!hashSet.contains(value))
            {
                arrayList.add(value);
            }
            value++;
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] a = {1,1};
        solve(a);
    }
}
