package com.company.leetcode.dsaseries;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionofTwoArraysII {

    public static int [] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        int k=0;
        for(int x:nums1)
        {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(int i=0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]))
            {
                map.put(nums2[i],map.get(nums2[i])-1);
                arrayList.add(nums2[i]);
                int num=map.get(nums2[i]);
                if(num==0)
                {
                    map.remove(nums2[i]);
                }
            }
        }

        int [] temp=new int[arrayList.size()];
        for(int i=0;i< arrayList.size();i++)
        {
            temp[k]=arrayList.get(i);
            k++;
        }
        return temp;

    }

    public static void main(String[] args) {
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        intersect(nums1,nums2);
    }
}
