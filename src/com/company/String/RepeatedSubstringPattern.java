package com.company.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RepeatedSubstringPattern {
    //algo - double the input string ,s1=abababab  , now remove the first and last character s1=bababa and check if s1 contains s
    public static boolean repeatedSubstringPattern(String s) {

        String newS1=s+s;
        newS1=newS1.substring(1,2*s.length()-1);
        if(newS1.contains(s))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="abab";
        repeatedSubstringPattern(s);

    }
}
