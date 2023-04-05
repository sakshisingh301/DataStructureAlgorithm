package com.company.studyplanLeetcode;

import java.util.HashSet;

public class FirstLettertoAppearTwice {

    public static char repeatedCharacter(String s) {
        char firstRepeated=Character.MIN_VALUE;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
            }
            else {
                firstRepeated=s.charAt(i);
                break;
            }
        }

       return firstRepeated;

    }



    public static void main(String[] args) {
        String s = "abccbaacz";
        repeatedCharacter(s);


    }
}
