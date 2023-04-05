package com.company.studyplanLeetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String result="";
        String first=strs[0];
        String last=strs[strs.length-1];
        int pointer1=0;
        int pointer2=0;
        while(pointer1<first.length() && pointer2<last.length() )
        {
            if(first.charAt(pointer1)==last.charAt(pointer1))
            {
                result=result+first.charAt(pointer1);
                pointer1++;
                pointer2++;
            }
            else {
                break;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        longestCommonPrefix(strs);
    }
}
