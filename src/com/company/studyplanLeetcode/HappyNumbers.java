package com.company.studyplanLeetcode;

import java.util.HashSet;

public class HappyNumbers {
    public static boolean isHappy(int n) {
        boolean isHappy=true;
        HashSet<Integer> hashSet=new HashSet<>();
        while(n!=1 && !hashSet.contains(n) )
        {
            hashSet.add((n));
            n=squareNumber(n);
        }


    return true;

    }

    public static int squareNumber(int n)
    {

        int result=0;
        while(n!=1)
        {
            int last=n%10;
            int num=n/10;
           result=result+last*last;
         n=num;
        }
     return result;
    }

    public static void main(String[] args) {
        int n=19;


    }
}
