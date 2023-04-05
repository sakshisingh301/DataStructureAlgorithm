package com.company.algoexpert;

public class PalindromCheck {

    public static boolean isPalindrome(String str) {
        boolean isPalindrome=true;
        int start=0;
        int end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(start)==str.charAt(end))
            {
                start++;
                end--;
            }
            else {
                isPalindrome=false;
                break;
            }
        }

        return isPalindrome;
    }
    public static void main(String[] args) {
        String a="abcdcba";
        isPalindrome(a);
    }
}
