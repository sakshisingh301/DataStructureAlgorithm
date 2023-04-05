package com.company.studyplanLeetcode;

import java.util.HashMap;

public class PermutationinString1 {

    public static boolean checkInclusion(String s1, String s2) {


       int [] arrayS1=new int[26];
       int [] arrays2=new int[26];

       for(int i=0;i<s1.length();i++)
       {
           arrayS1[s1.charAt(i)-'a']++;
       }

       int window= s1.length();
       int i=0;
       int j=0;
       while(j<s2.length())
       {

           arrays2[s2.charAt(j)-'a']++;

           if(j-i+1<window)
           {
               j++;

           }
           else if(j-i+1==window)
           {
            if(matches(arrayS1,arrays2))
            {
                return true;
            }

             arrays2[s2.charAt(i)-'a']--;
               i++;
               j++;
           }
       }
        return false;

    }

    public static boolean matches(int [] s1,int [] s2)
    {
        for(int i=0;i<26;i++)
        {
            if(s1[i]!=s2[i])
            {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        checkInclusion(s1,s2);
    }
}
