package com.company.studyplanLeetcode;

import java.util.Stack;

public class BasicCalculator {

    public static int calculate(String s) {

        Stack<Integer> stack=new Stack<>();
        int currentNumber=0;
        char operation= '+';
        for(int i=0;i<s.length();i++)
        {
            char currentChar=s.charAt(i);
            if(Character.isDigit(s.charAt(i)))
            {
                currentNumber=(currentNumber * 10) + (currentChar - '0');


            }
           if(!Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)) || i==s.length()-1)
            {

                if(operation=='+')
                {
                    stack.push(currentNumber);
                }
                else if(operation=='-')
                {
                    stack.push(-currentNumber);
                }
                else if(operation=='*')
                {
                    stack.push(currentNumber * stack.pop());
                }
                else if(operation=='/')
                {
                    stack.push(stack.pop()/currentNumber);
                }
                operation=currentChar;
                currentNumber=0;
            }

        }
        int result=0;
        while(!stack.isEmpty())
        {
           result=result+stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "3/2";
        calculate(s);
    }
}
