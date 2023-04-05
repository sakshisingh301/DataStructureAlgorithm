package com.company.studyplanLeetcode;

import java.util.HashMap;
import java.util.HashSet;

public class longestPalindome {

    public static int longestPalindrome(String s) {
        boolean uniqueLetter=false;
        if(s.length()==1)
            return 1;

        int pair=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
            }
            else if(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(i));
                pair++;
            }
        }
        if(set.isEmpty())
            return 2*pair;

        return 2*pair+1;

    }



        public static void main(String[] args) {
        String s = "bb";
        longestPalindrome(s);
    }
}
