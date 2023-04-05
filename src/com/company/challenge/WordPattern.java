package com.company.challenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String [] words=s.split("\\s+");
        HashMap<Character,String> map=new HashMap<>();
        Set<String> visitedVal=new HashSet<>();
        if(pattern.length()!= words.length)
            return false;

        for(int i=0;i<pattern.length();i++)
        {
            char key=pattern.charAt(i);
            String val=words[i];
            if(map.containsKey(key) && !map.get(key).equals(val))
                return false;
            if(!map.containsKey(key))
            {
              if(!visitedVal.contains(val))
              {
                  map.put(key,val);
                  visitedVal.add(val);
              }
              else
              {
                  return false;
              }
            }



        }
        return true;





    }

    public static void main(String[] args) {
       String pattern = "abba";
       String s = "dog cat cat dog";

    }
}
