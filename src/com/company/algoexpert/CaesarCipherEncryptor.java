package com.company.algoexpert;

public class CaesarCipherEncryptor {
    public static String caesarCypherEncryptor(String str, int key) {

        String result="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            int acii=(int)c +key;
            if(acii>122)
            {
                while(acii>122) {
                    acii = acii - 26;
                }
            }
            char inter=(char)acii;

            result=result +inter;


        }

return result;
        }

    public static void main(String[] args) {
        String s="xyz";
        int key=2;
        caesarCypherEncryptor(s,key);
    }
}
