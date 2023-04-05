package com.company.studyplanLeetcode;

public class isSequence {

    public static boolean isSubsequence(String s, String t) {
        int i=0;
        for(int j=0;j<t.length();j++)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                if(j==s.length())

                    return true;

            }

        }
        return false;

    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

//"acb"
//"ahbgdc"

        isSubsequence(s,t);
    }
}
