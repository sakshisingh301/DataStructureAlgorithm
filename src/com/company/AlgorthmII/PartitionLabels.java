package com.company.AlgorthmII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {
    public static List<Integer> partitionLabels(String s) {

        List<Integer> res=new ArrayList<>();
       int [] last=new int[26];

       for(int i=0;i<s.length();i++)
       {
           last[s.charAt(i)-'a']=i;
       }

     int end=0;
       int start=0;
       for(int i=0;i<s.length();i++)
       {
           end=Math.max(end,last[s.charAt(i)-'a']);
           if(i==end)
           {
               res.add(end-start+1);
               start=end+1;

           }

       }
       return res;



    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        partitionLabels(s);


    }


}
