package com.company.DSA;

import java.util.HashMap;
import java.util.HashSet;

public class lONGESTpALINDROME {
    public static int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int odd=0;

        for(int i: map.values())
        {
            if(i%2!=0)
            {
               result=result+i-1;
               odd=1;
            }
            else {
                result=result+i;
            }
        }
       return result+odd;
    }

    public static void main(String[] args) {
        String s="abccccdd";
        longestPalindrome(s);

    }
}
