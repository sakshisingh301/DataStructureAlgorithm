package com.company.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int maxresult = 0;
        int i = 0;
        int j = 0;
        int count=0;

        while (j < s.length()) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            count= map.size();
            if(count==j-i+1)
            {
                max=j-i+1;
                if(max>maxresult)
                {
                    maxresult=max;
                }
                j++;

            }
            else if(count<j-i+1)
            {
                while(count!=j-i+1)
                {
                    if (map.containsKey(s.charAt(i))) {
                        map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                        if (map.get(s.charAt(i)) == 0) {
                            count--;
                            map.remove(s.charAt(i));
                        }
                    }
                    i++;
                }
                j++;
            }


        }
        return max;
    }
        public static void main(String[] args) {
            String  s = "nfpdmpi";
            System.out.println(lengthOfLongestSubstring(s));

        }

    }