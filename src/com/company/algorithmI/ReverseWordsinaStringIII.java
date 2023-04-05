package com.company.algorithmI;

public class ReverseWordsinaStringIII {

    public String reverseWords(String s) {
        char [] c=s.toCharArray();
        int length=s.length();

        for(int i=0;i<length;i++)
        {
            String curr= String.valueOf(c[i]);
            int startIndex=0;
            int endIndex=curr.length()-1;
            while (startIndex<endIndex)
            {
                char temp=curr.charAt(startIndex);
                //curr.charAt(startIndex)=curr.charAt(endIndex);
                //c
            }
        }
        return "";


    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        //"s'teL ekat edoCteeL tsetnoc"
    }
}
