package com.company.leetcode.dsaseries;

import java.util.ArrayList;

public class plusOne1 {
    public  static int[] plusOne(int[] digits) {


      int n=digits.length;

        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            else if(digits[i]==9)
            {

              digits[i]=0;
            }


        }
        digits=new int[n+1];
        digits[0]=1;

        return digits;


    }

    public static void main(String[] args) {
        int [] digits = {8,9,9,9};
        plusOne(digits);

    }
}
