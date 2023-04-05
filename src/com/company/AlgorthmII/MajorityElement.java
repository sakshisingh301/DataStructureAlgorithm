package com.company.AlgorthmII;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        int length=nums.length;
        int targetCount=length/2;
        int majorityElement=-1;
        HashMap<Integer,Integer> map=new HashMap<>();


        for(int x:nums)
        {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int val=entry.getValue();
            if(val>targetCount)
            {
                majorityElement=entry.getKey();
            }
        }
     return majorityElement;
    }

    public static void main(String[] args) {
        int [] nums={2,2,1,1,1,2,2};

    }
}
