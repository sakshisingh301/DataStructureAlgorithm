package com.company.companyWise.expedia;

import java.util.HashMap;

public class SingleRowKeyboard {
    public static int calculateTime(String keyboard, String word) {
        int time=0;
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<keyboard.length();i++)
            {
                map.put(keyboard.charAt(i),i);
            }
         int pre_index=0;
        for(int i=0;i<word.length();i++)
        {
            int index=map.get(word.charAt(i));
            time=time+Math.abs(index-pre_index);
            pre_index=index;
        }
        return time;

    }

    public static void main(String[] args) {
         String keyboard = "abcdefghijklmnopqrstuvwxyz";String  word = "cba";
        System.out.println(calculateTime(keyboard,word));

    }
}
