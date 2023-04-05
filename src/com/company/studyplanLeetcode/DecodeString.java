package com.company.studyplanLeetcode;

import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s)
    {
        StringBuilder result=new StringBuilder();

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=']') {
                stack.push(s.charAt(i));
            }
            else
            {
               StringBuilder temp=new StringBuilder();
                while(stack.peek()!='[')
                {
                    temp.append(stack.peek());
                    stack.pop();
                }
           stack.pop();
                int count=0;

                while(!stack.isEmpty() && Integer.parseInt(String.valueOf(stack.peek()))>0 && Integer.parseInt(String.valueOf(stack.peek()))<=9)
                {
                    count=Integer.parseInt(String.valueOf(stack.pop()))+count;

                }


                for(int j=0;j<count;j++)
                {
                 result=result.append(temp);
                }


            }


        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        decodeString(s);


    }
}
