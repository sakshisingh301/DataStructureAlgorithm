package com.company.AlgorthmII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        String[] word = s.split("\\s+");
        Set<String> visited=new HashSet<>();

        if(word.length!=pattern.length())
            return false;
        HashMap<Character,String> map=new HashMap<>();
        for (int i=0;i<pattern.length();i++)
        {
            char key=pattern.charAt(i);
            String val=word[i];
            if(map.containsKey(key) &&!map.get(key).equals(val)   )
            {
            return false;
            }
            if(!map.containsKey(key) )
            {
                if(  !visited.contains(val)) {
                    map.put(key, val);
                    visited.add(val);
                }
                else {
                    return false;
                }


            }


        }
        return true;

    }

    public static void main(String[] args) {
       String pattern = "abba";
       String  s = "dog dog dog dog";
       wordPattern(pattern,s);
    }
}
