package com.company.companyWise.expedia;

public class DetermineifStringHalvesAreAlike {

    public static boolean halvesAreAlike(String s) {

        String part1=s.substring(0,s.length()/2);
        String part2=s.substring(s.length()/2,s.length());
      int count1=  countVowel(part1);
      int count2=countVowel(part2);
      if(count1==count2)
        return true;
return false;
    }

    private static int countVowel(String str) {
        int countVowel=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                countVowel++;
            }
        }
        return countVowel;
    }

    public static void main(String[] args) {
        String s="book";
        halvesAreAlike(s);

    }
}
