package com.company.Arrays;


import java.util.HashMap;
import java.util.Map;

public class Majorityelement {

    public static int solution(int [] arr,int N)
    {
        int result=-1;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int x: arr)
        {
            if(!hashMap.containsKey(x))
            {
                hashMap.put(x,1);
            }
            else
            {
                hashMap.put(x, hashMap.get(x)+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value>N/2)
            {
               result=key;
            }

        }
        return result;
    }

    //moore voting algorithm for N/2
    public static int optimalSolution(int [] arr, int N)
    {
        int majority=arr[0];
        int count=1;
        int countMajority=0;

        for(int i=1;i<N;i++)
        {
            if(arr[i]==majority)
            {
               count++;
            }
            else
            {
                count--;
                if(count==0)
                {
                    majority=arr[i];
                    count=1;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            if(arr[i]==majority)
            {
                countMajority++;
            }
        }
        if(countMajority>N/2)
        return majority;
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={3,1,3,3,2};
        int N=5;
       // System.out.println(solution(arr,N));
        System.out.println(optimalSolution(arr,N));
    }
}
