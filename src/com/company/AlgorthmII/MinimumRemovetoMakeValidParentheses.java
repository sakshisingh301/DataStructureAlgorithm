package com.company.AlgorthmII;

import java.util.HashMap;
import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {
    public static String minRemoveToMakeValid(String s) {


        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            stringBuilder.append(s.charAt(i));
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char currentChar=s.charAt(i);

            if(currentChar=='(' || currentChar==')')
            {
             if(!stack.isEmpty() && currentChar==')' && s.charAt(stack.peek())=='(')
             {
                 stack.pop();
             }
             else
             {
                 stack.push(i);
             }
            }
        }

        while(!stack.isEmpty())
        {
            int index=stack.peek();
            stringBuilder.deleteCharAt(index);

            stack.pop();
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {

        String  s = "))((";
        minRemoveToMakeValid(s);



    }
}
