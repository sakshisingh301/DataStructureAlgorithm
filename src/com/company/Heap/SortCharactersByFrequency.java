package com.company.Heap;

import java.util.*;


public class SortCharactersByFrequency {

    public  static String frequencySort(String s) {
        StringBuilder result=new StringBuilder();

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        maxHeap.addAll(map.entrySet());
        while (maxHeap.size()>0)
        {
         char key= maxHeap.peek().getKey() ;
         int val=maxHeap.peek().getValue();
         for(int i=0;i<val;i++)
         {
             result.append(key);
         }
         maxHeap.poll();
        }
        return result.toString();











    }

    public static void main(String[] args) {
       String  s = "tree";
       frequencySort(s);

    }
}
