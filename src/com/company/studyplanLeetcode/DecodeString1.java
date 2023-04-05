package com.company.studyplanLeetcode;

import java.util.Stack;

public class DecodeString1 {

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

                int base = 1;
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    count = (stack.pop() - '0') * base + count;
                    base *= 10;
                }

                while(count-->0)
                {
                    for(int j=temp.length()-1; j>=0; j--){
                        stack.push(temp.charAt(j));
                    }

                }

            }


        }
        while(!stack.isEmpty())
        {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }

    public static String decodeString1(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                stack.push(ch);
            }else{
                //get the sub string
                StringBuilder sb = new StringBuilder();
                while(stack.peek() != '['){
                    sb.append(stack.pop());
                }
                //remove the '[' character
                stack.pop();
                //get the number
                int k = 0;
                int base = 1;
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    k = (stack.pop() - '0') * base + k;
                    base *= 10;
                }
                //put back the substring in stack k times
                while(k-- > 0){
                    for(int i=sb.length()-1; i>=0; i--){
                        stack.push(sb.charAt(i));
                    }
                }
            }
        }
        char[] result = new char[stack.size()];
        for(int i=stack.size()-1;i>=0;i--)
            result[i] = stack.pop();
        return new String(result);
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        decodeString(s);


    }
}
