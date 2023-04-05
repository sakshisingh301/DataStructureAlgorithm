package com.company.String;

import java.util.Set;

public class ReverseVowelsOfaString {
    public static String reverseVowels(String s) {

        int start=0;
        int end=s.length()-1;
        char [] c=s.toCharArray();
        Set<Character>vowel= Set.of('a','e','i','o','u','A','E','I','O','U');

        while (start<end)
        {

            if(vowel.contains(c[start]) && vowel.contains(c[end]))
            {

                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;

                start++;
                end--;

            }
            else  if(!vowel.contains(c[start]) && !vowel.contains(c[end]))
            {
                start++;
                end--;

            }
            else if(!vowel.contains(c[start])&&vowel.contains(c[end]) )
            {
                start++;
            }
            else if(vowel.contains(c[start])&&!vowel.contains(c[end]) )
            {
                end--;
            }


        }

   return String.valueOf(c);

    }




    public static void main(String[] args) {
        String s = "leetcode";
        reverseVowels(s);
    }
}
