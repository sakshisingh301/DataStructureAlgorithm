package com.company.companyWise.expedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<String,List> map=new HashMap<>();

        for(String str: strs)
        {
           char [] curr=str.toCharArray();
            Arrays.sort(curr);
            String key=String.valueOf(curr);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());




    }

    public static void main(String[] args) {
       String []  strs = {"eat","tea","tan","ate","nat","bat"};

    }
}
