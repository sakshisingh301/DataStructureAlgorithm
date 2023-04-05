package com.company.Stack;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        boolean isValid=false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
                stack.push(s.charAt(i));

         if(!stack.isEmpty() &&s.charAt(i)==')' && stack.peek()==')'  )
         {
             char temp=stack.peek();
             if(!stack.isEmpty())
             stack.pop();
             if(!stack.isEmpty() &&stack.peek()=='(' && temp==')')
             {
               stack.pop();
             }
             else {
                 stack.push(temp);
             }

         }
         else if(!stack.isEmpty() &&s.charAt(i)=='}' && stack.peek()=='}')
         {
             char temp=stack.peek();
             if(!stack.isEmpty())
             stack.pop();
             if(!stack.isEmpty() &&stack.peek()=='{' && temp=='}')
             {
                 stack.pop();
             }
             else {
                 stack.push(temp);
             }

         }
         else if(!stack.isEmpty() &&s.charAt(i)==']' && stack.peek()==']')
         {
             char temp=stack.peek();
             if(!stack.isEmpty())
             stack.pop();
             if(!stack.isEmpty() &&stack.peek()=='[' && temp==']')
             {
                 stack.pop();
             }
             else {
                 stack.push(temp);
             }

         }
        }
        if(stack.isEmpty())
        {
            isValid=true;

        }
        return isValid;
    }
    public static void main(String[] args) {
     // String s= "([}}])";
      String s = "){";
        isValid(s);


    }
}
