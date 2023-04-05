package com.company.companyWise.expedia;

import java.util.HashMap;

public class StringCompression {

    public static int compress(char[] chars) {

        int count=1;
        StringBuilder stringBuilder=new StringBuilder();
        int i=0;
        int j=0;

        while(j<chars.length)
        {
            char currentChar=chars[j];
            while (j<chars.length-1 && currentChar==chars[j+1])
            {
                j++;
                count++;
                currentChar=chars[j];
            }
            if(count==1)
            {
                stringBuilder.append(currentChar);
            }
            else
            {
                stringBuilder.append(currentChar).append(count);
            }
            count=1;
            j++;
        }

        for(int index=0;index<stringBuilder.length();index++)
        {
            chars[index]=stringBuilder.charAt(index);
        }
        return stringBuilder.length();

    }

    public static void main(String[] args) {

       char []  chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
       compress(chars);


    }
}
