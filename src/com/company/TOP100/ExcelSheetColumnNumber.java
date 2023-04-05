package com.company.TOP100;

import java.util.HashMap;

public class ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int result=0;

        HashMap<Character,Integer> map=new HashMap<>();
         for(int i=0;i<26;i++)
         {
             int  c=i+65;
             map.put((char)c,i+1);
         }
         int k=0;
         for(int i=columnTitle.length()-1 ; i>=0;i--)
         {
             char curr=columnTitle.charAt(i);

             result= (int) (result+map.get(curr)* Math.pow(26,k));
             k++;
         }
         return result;


    }

    public static void main(String[] args) {
        String s="AB";
        titleToNumber(s);

    }
}
