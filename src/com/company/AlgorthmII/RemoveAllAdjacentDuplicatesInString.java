package com.company.AlgorthmII;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

    public static String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder stringBuilder=new StringBuilder();
        stack.push(s.charAt(0));

         for(int i=1;i<s.length();i++)
         {
             char currentChar=s.charAt(i);
             if(!stack.isEmpty() && currentChar==stack.peek())
             {
                 stack.pop();
             }
             else
             {
                 stack.push(currentChar);
             }
         }
         while(!stack.isEmpty())
         {
             stringBuilder.append(stack.pop());
         }
         return stringBuilder.reverse().toString();

    }

    public static void main(String[] args) {
        String s="abbaca";

    }
}
