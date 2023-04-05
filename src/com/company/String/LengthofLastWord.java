package com.company.String;

public class LengthofLastWord {

    public static int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
int length=0;
       for(int i=0;i<words.length;i++)
       {
           if(i==words.length-1)
           {
               String word=words[i];
               length=word.length();
               break;
           }
       }
        return length;

    }

    public static void main(String[] args) {
        String s="Hello World";
        lengthOfLastWord(s);

    }
}
