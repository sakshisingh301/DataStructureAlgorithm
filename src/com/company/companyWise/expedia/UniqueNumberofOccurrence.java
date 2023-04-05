package com.company.companyWise.expedia;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrence {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        HashSet<Integer> hashSet=new HashSet<>();
        for (int value : map.values()) {
         hashSet.add(value);
        }
        if(hashSet.size()==map.size())
            return true;
        return false;


    }

    public static void main(String[] args) {

        int [] nums = {1,2};
       System.out.println( uniqueOccurrences(nums));

    }
}
