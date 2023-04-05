package com.company.companyWise.expedia;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs)
    {
        StringBuilder str=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int p1=0;
        int p2=0;

        while(p1<first.length() && p2<last.length())
        {
            if(first.charAt(p1)==last.charAt(p2))
            {
                str.append(first.charAt(p1));
                p1++;
                p2++;
            }
            else {
                break;
            }

        }
        return str.toString();
    }
}
