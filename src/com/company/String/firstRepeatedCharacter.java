package com.company.String;

import java.util.HashSet;

public class firstRepeatedCharacter {

    public static String solution(String s)
    {
        HashSet<Character> hashSet=new HashSet<>();
        String result="";
        for(int i=0;i<s.length();i++)
        {
            if(!hashSet.contains(s.charAt(i)))
            {
                hashSet.add(s.charAt(i));
            }
            else
            {
             result= String.valueOf(s.charAt(i));
             return result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s="hello geeks";
        System.out.println(solution(s));

    }
}
