package com.company.studyplanLeetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class PermutationinString {

    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map2=new HashMap<>();
        HashMap<Character, Integer> map1=new HashMap<>();

        for(int i=0;i<s1.length();i++)
        {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }
       int window= s1.length();
       int i=0;
       int j=0;
       while(j<s2.length())
       {
           char c = s2.charAt(j);
           map2.put(c, map2.getOrDefault(c, 0) + 1);
           int count= map2.size();
           if(j-i+1<window)
           {
               j++;

           }
           else if(j-i+1==window)
           {
             char a=s2.charAt(j);
            if(map1.containsKey(a))
            {
                map1.put(a,map1.get(a)-1);
                if(map1.get(a)==0)
                {
                    map1.remove(a);
                }

            }
            map2.remove(s2.charAt(i));

               i++;
               j++;
           }
       }
        return false;

    }



    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        checkInclusion(s1,s2);
    }
}
