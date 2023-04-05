package com.company.studyplanLeetcode;

public class ReverseWordsinaStringIII {
    public static String reverseWords(String s) {
        StringBuilder sbFinal = new StringBuilder();
        StringBuilder sb = new StringBuilder();
     int k=0;
     for(int i=0;i<s.length();i++)
     {
         if(!Character.isWhitespace(s.charAt(i))) {
             sb.append(s.charAt(i));

         }
         char result[] = sb.toString().toCharArray();
         if(Character.isWhitespace(s.charAt(i)) || i==s.length()-1)
         {
             sbFinal.append(twoPointer(result,k,i-1));
             sbFinal.append(" ");
             k=i+1;
             sb.delete(0,i);
         }


     }
   return sbFinal.toString().trim();



    }

    public static String twoPointer(char []  s,int i,int j)
    {
       int start=0;
        int end=s.length-1;
        StringBuilder sb = new StringBuilder();
        while(start<end)
        {
          char temp= s[start];
          s[start]=s[end];
            s[end]=temp;
          start++;
          end--;
        }
        return sb.append(s).toString();
    }

    public static void main(String[] args) {

       String s = "Let's take LeetCode contest";
       reverseWords(s);

    }
}
