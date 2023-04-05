package com.company.AlgorthmII;

import java.util.HashSet;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<>();
        int pair=0;
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
            }
            else
            {
                set.remove(s.charAt(i));
                pair++;
            }
        }
        if(set.isEmpty())
        {
            return 2*pair;
        }
        return 2*pair+1;



    }
}
