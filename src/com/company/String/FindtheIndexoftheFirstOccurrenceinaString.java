package com.company.String;

public class FindtheIndexoftheFirstOccurrenceinaString {

    public static int strStr(String haystack, String needle) {

        int i=0;
        int j=0;
        int k=needle.length();
        while(j<haystack.length())
        {
            char c=haystack.charAt(j);
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
               String res=haystack.substring(i,j+1);
               if(res.equals(needle))
               {
                   return i;
               }
                i++;
                j++;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        strStr(haystack,needle);

    }
}
