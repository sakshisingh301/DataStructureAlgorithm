package com.company.Arrays;

public class PalindomeNumber {

    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        String str = Integer.toString(x);
        boolean isPalindrome=true;
        int start=0;
        int end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
      return isPalindrome;

    }
    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));
    }
}
