package com.company.Arrays;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        if(x<0) return false;
       int start=0;
       int end=str.length();
       while (start<end)
       {
           if(str.charAt(start)!=str.charAt(end))
           {
               return false;
           }
           start++;
           end--;

       }
       return true;

    }

    public static void main(String[] args) {

    }
}
