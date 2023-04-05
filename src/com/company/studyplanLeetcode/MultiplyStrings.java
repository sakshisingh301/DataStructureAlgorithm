package com.company.studyplanLeetcode;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {

        int num11=Integer.parseInt(num1);
        int num22=Integer.parseInt(num2);
        int result=num11*num22;
        return String.valueOf(result);

    }
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "987654321";
       System.out.println(multiply(num1,num2));

    }
}
