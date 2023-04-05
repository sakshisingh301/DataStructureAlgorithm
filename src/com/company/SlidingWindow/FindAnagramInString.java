package com.company.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAnagramInString {

    public static List<Integer> findAnagrams(String s, String p) {

        int k=p.length();
        List<Integer> list=new ArrayList<>();
        HashMap<Character, Integer> map=new HashMap<>();
        for(char c : p.toCharArray())
        {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count=map.size();
        int i=0;
        int j=0;
        while(j<s.length())
        {
            char c=s.charAt(j);
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)-1);
                if(map.get(c)==0)
                    count--;
            }
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
             if(count==0)
             {
                 list.add(i);
             }

             if(map.containsKey(s.charAt(i)))
             {
                 map.put(s.charAt(i),map.get(s.charAt(i))+1);
                 if(map.get(s.charAt(i))==1)
                 {
                     count++;
                 }


             }
                i++;
                j++;
            }
        }
    return list;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        findAnagrams(s,p);

    }
}
