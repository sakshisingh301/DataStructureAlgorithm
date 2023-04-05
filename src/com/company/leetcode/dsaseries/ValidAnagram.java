package com.company.leetcode.dsaseries;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        boolean isANAGRAM=false;
        if(s.length()!=t.length())
            return false;

        HashMap<Character,Integer> map=new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }

        for(int i=0;i<t.length();i++)
        {
            if(map.containsKey(t.charAt(i)))
            {
                map.put(t.charAt(i),map.get(t.charAt(i)) - 1);
                if(map.get(t.charAt(i))==0)
                {
                    map.remove(t.charAt(i));
                }
            }
        }
        if(map.isEmpty())
        {
            isANAGRAM=true;
        }
        return isANAGRAM;

    }

    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        isAnagram(s,t);
    }


}
