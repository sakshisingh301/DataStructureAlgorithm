package com.company.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

    public static String frequencySort(String s) {
        StringBuilder result=new StringBuilder();
        PriorityQueue<Map.Entry<Character,Integer>> queue=new PriorityQueue<>((a, b)->b.getValue()-a.getValue());

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        queue.addAll(map.entrySet());
        while(!queue.isEmpty())
        {
            int key=queue.peek().getKey();
            int val=queue.peek().getValue();
            for(int i=0;i<val;i++)
            {
                result.append(key);
            }
            queue.poll();
        }
        return result.toString();




    }
    public static void main(String[] args) {
        String s = "tree";

    }
}
