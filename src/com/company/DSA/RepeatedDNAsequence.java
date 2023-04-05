package com.company.DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNAsequence {
    public static List<String> findRepeatedDnaSequences(String s) {
        StringBuilder str=new StringBuilder();
        HashSet<String> seen=new HashSet<>();
        HashSet<String> result=new HashSet<>();

        int k=10;
        int i=0;
        int j=0;

        while(j<s.length())
        {
            String  st=str.append(s.charAt(j)).toString();
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                if(!seen.contains(st))
                {
                    seen.add(st);
                }
                else
                {
                    result.add(st);
                }
                i++;
                j++;
               str= new StringBuilder(str.substring(1));


            }
        }
        List<String > result_F
                = new ArrayList<>(result);
        return result_F;

    }

    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        findRepeatedDnaSequences(s);

    }

}




