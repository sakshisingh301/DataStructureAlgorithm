package com.company.studyplanLeetcode;


import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<HashMap<Integer,Integer>> min_heap = new PriorityQueue<>();
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
       return null;




    }
    public static void main(String[] args) {
       int [] nums = {1,1,1,2,2,3};
       int k=2;
    }
}
