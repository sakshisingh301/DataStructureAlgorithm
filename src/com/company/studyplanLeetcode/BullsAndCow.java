package com.company.studyplanLeetcode;

import java.util.HashMap;
import java.util.HashSet;

public class BullsAndCow {
    public static String getHint(String secret, String guess) {
        String result="";
        int bulls=0;
        int cows=0;
        int [] nums=new int[10];
        for(int i=0;i<secret.length();i++)
        {
           int s=Character.getNumericValue(secret.charAt(i));
           int g=Character.getNumericValue(guess.charAt(i));
           if(s==g)
           {
               bulls++;
           }
            else
            {
                if (nums[s] < 0) cows++;
                if (nums[g] > 0) cows++;
                nums[s]++;
                nums[g]--;


            }
        }

result=bulls+"A"+cows+"B";
    return result;



    }

    public static void main(String[] args) {
        String secret="1807";
        String guess= "7810";
        getHint(secret,guess);

    }
}
