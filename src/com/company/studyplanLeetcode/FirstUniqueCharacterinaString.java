package com.company.studyplanLeetcode;

import java.util.HashSet;

public class FirstUniqueCharacterinaString {

    public static int firstUniqChar(String s) {
        int [] temp=new int[256];
        for(int i=0;i<s.length();i++)
        {
         temp[s.charAt(i)]++;
        }

        for(int i=0;i<s.length();i++)
        {
            if(temp[s.charAt(i)]==1)
            {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String  s = "aabb";
        firstUniqChar(s);

    }
}
