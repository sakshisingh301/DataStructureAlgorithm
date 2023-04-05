package com.company.challenge;

import java.util.HashMap;
import java.util.Map;

public class MinimumRoundstoCompleteAllTasks {

    public static int minimumRounds(int[] tasks) {
        int count = 0; HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : tasks)
            map.put(x,map.getOrDefault(x,0)+1);
        for(int x : map.keySet())
            if(map.get(x)==1)return -1;
            else{
                count+=map.get(x)/3;
                if(map.get(x)%3!=0)count++;
            }
        return count;

    }

    public static void main(String[] args) {

        int [] tasks = {2,2,3,3,2,4,4,4,4,4};
        minimumRounds(tasks);

    }
}
