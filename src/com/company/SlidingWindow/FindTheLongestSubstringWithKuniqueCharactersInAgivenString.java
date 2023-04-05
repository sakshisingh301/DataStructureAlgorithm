package com.company.SlidingWindow;

import java.util.HashMap;

public class FindTheLongestSubstringWithKuniqueCharactersInAgivenString {

    public  static int solution(String s,int k)
    {
        int i=0;
        int j=0;
        int max=0;
        int maxresult=0;
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<s.length())
        {

            char c=s.charAt(j);
            if(!map.containsKey(c))
            {
                map.put(c,1);
            }
            else
            {
                map.put(c, map.get(c)+1);
            }

            count=map.size();
            if(count<k)
            {
                j++;
            }
             else if(count==k)
            {
              max=j-i+1;
              if(max>maxresult)
              {
                  maxresult=max;
              }
              j++;
            }
            else if(count >k)
            {
                while(count>k) {
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
        return maxresult;
    }

    public static void main(String[] args) {
        String s="aabbcc";
        int k=2;
        System.out.println(solution(s,k));
    }
}
