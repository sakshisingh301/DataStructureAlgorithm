package com.company.algoexpert;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RunLengthEncoding {
    public static String runLengthEncoding(String string) {
        String result="";

        int count=0;
        int i=0;
        int j=0;
        while(j<string.length())
        {
            if(string.charAt(i)==string.charAt(j) && (j-i)<9)
            {
                count++;
                   j++;
            }
            else
            {
                result=result+count+string.charAt(i);
                count=0;
               i=j;
            }
        }
        result=result+count+string.charAt(i);




return result;
    }

    public static void main(String[] args) {
        String s="AAAAAAAAAAAAABBCCCCDD";
        runLengthEncoding(s);


    }
}
