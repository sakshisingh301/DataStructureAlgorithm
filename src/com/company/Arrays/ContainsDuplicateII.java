package com.company.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public static boolean solution(int [] a,int k)
    {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int diff=0;
        boolean status=false;
        for(int i=0;i<a.length;i++)
        {
            if(!hashMap.containsKey(a[i]))
            {
                hashMap.put(a[i],i);
            }
            else {
                int value=hashMap.get(a[i]);
                diff=Math.abs(i-value);
                hashMap.replace(a[i],i);
                if(diff<=k)
                {
                    status=true;
                }


            }
        }
        return status;
    }

    public static void main(String[] args) {
        int [] a={1,2,3,1,2,3};
        int k=2;
        System.out.println(solution(a,k));
    }
}
