package com.company.companyWise.expedia;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;

        while(j<s.length())
        {
            char currentChar=s.charAt(j);
            map.put(currentChar,map.getOrDefault(currentChar,0)+1);
            int mapSize= map.size();
            if(mapSize==j-i+1)
            {
                max=Math.max(max, j-i+1);
                j++;
            }
            else if(mapSize<j-i+1)
            {
                while (mapSize!=j-i+1)
                {
                    if(map.containsKey(s.charAt(i)))
                    {
                        map.put(s.charAt(i),map.get(s.charAt(i))-1);
                        if(map.get(s.charAt(i))==0)
                        {
                            map.remove(s.charAt(i));
                        }
                        i++;
                    }
                }
                j++;
            }

        }
        return max;



    }

    public static void main(String[] args) {
       String s = "abcabcbb";
    }
}
