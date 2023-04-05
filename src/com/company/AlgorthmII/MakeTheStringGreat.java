package com.company.AlgorthmII;

import java.util.Stack;

public class MakeTheStringGreat {

    public static String makeGood(String s) {

        Stack<Character> stack=new Stack<>();
        StringBuilder stringBuilder=new StringBuilder();
        stack.push(s.charAt(0));
         for(int i=1;i<s.length();i++)
         {
             char c=s.charAt(i);

             if(!stack.isEmpty() && Character.isUpperCase(c) && stack.peek()==Character.toLowerCase(c) || !stack.isEmpty() && Character.isLowerCase(c) && stack.peek()==Character.toUpperCase(c) )
             {
                 stack.pop();
             }
             else {
                 stack.push(s.charAt(i));
             }


         }
         while(!stack.isEmpty())
         {
             stringBuilder.append(stack.pop());
         }
         return stringBuilder.reverse().toString();


    }

    public static void main(String[] args) {
        String s = "abBAcC";
        makeGood(s);



    }
}
