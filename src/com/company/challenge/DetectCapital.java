package com.company.challenge;

public class DetectCapital {

    public static boolean detectCapitalUse(String word) {
        boolean match1=true;
        boolean match2=true;
        boolean match3=true;

        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isLowerCase(c))
            {
                match1=false;
                break;
            }

        }
        if(match1)
        {
            return true;

        }

        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isUpperCase(c))
            {
                match2=false;
                break;
            }
        }
        if(match2)
        {
            return true;
        }

       if(!Character.isUpperCase(word.charAt(0)))
       {
           match3=false;
       }
       if(match3)
       {
           for(int i=1;i<word.length();i++)
           {
               if(!Character.isLowerCase(word.charAt(i)))
               {
                   match3=false;
                   break;
               }
           }
       }
       if(match3)
       {
           return true;
       }

        return false;

    }


    public static void main(String[] args) {
        String word = "USA";

    }
}
