package com.company.studyplanLeetcode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacter {

    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        int length=0;
        while (j<s.length())
        {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            int mapCount=map.size();
            if(mapCount==j-i+1)
            {
                max=j-i+1;
                if(max>length)
                {
                    length=max;
                }
                j++;
            }
            else if(mapCount<j-i+1)
            {
                while(mapCount!=j-i+1) {
                    if (map.containsKey(s.charAt(i))) {
                        map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                        if (map.get(s.charAt(i)) == 0) {
                            mapCount--;
                            map.remove(s.charAt(i));
                        }
                    }
                  i++;
                }
                j++;
            }

        }
        return length;

    }

    public static void main(String[] args) {
        String s= "pwwkew";
       System.out.println(lengthOfLongestSubstring(s));
    }
}
