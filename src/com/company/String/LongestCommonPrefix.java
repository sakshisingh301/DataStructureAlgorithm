package com.company.String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        for(int i=0;i< strs.length;i++)
        {
            if(strs[i].equals(""))
            {
                return "";
            }
        }
        String result="";
        String first=strs[0];
        String last=strs[strs.length-1];
        int pointer1=0;
        int pointer2=0;
        while (pointer1<first.length() && pointer2<last.length())
        {
            if(first.charAt(pointer1)!=last.charAt(pointer2))
            {
                break;
            }
            result=result+first.charAt(pointer1);
            pointer1++;
            pointer2++;
        }
    return result;

    }

    public static void main(String[] args) {
        String[] strs = new String[]{"ab", "a"};
        longestCommonPrefix(strs);

    }
}
