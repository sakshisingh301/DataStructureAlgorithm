package com.company.DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LargestPalindromicNumber {

    public static String largestPalindromic(String num) {
        HashSet<Integer> set=new HashSet<>();

        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder result=new StringBuilder();
        int max=Integer.MIN_VALUE;
        int oddMax= Integer.MIN_VALUE;
        for(int i=0;i<num.length();i++)
        {
            map.put(num.charAt(i),map.getOrDefault(num.charAt(i),0)+1);
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet())
        {
            int val=entry.getValue();
            int key=entry.getKey()-'0';
            if(val%2!=0)
            {
                oddMax=Math.max(oddMax,key);
            }
            else {
                for(int i=0;i<val;i++) {
                    stringBuilder.append(key);
                }
            }

        }

        result.setLength(stringBuilder.length()+1);
      int [] list=new int[stringBuilder.length()];
      for(int i=0;i<list.length;i++)
      {
          list[i]=stringBuilder.charAt(i)-'0';
      }
      Arrays.sort(list);
      for(int i=list.length-1;i>=0;i--)
      {

      }


        return "";

    }


    public static void main(String[] args) {
        String num = "444947137";
        largestPalindromic(num);

    }
}
