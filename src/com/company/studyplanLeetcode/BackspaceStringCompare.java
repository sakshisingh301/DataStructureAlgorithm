package com.company.studyplanLeetcode;

import java.util.Stack;

public class BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                stack1.push(s.charAt(i));
            }
            else {
                if(!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)!='#')
            {
                stack2.push(t.charAt(i));
            }
            else {
                if(!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }
        String compare1="";
        while(!stack1.isEmpty())
        {
           compare1=compare1+stack1.pop();
        }
        String compare2="";
        while(!stack2.isEmpty())
        {
            compare2=compare2+stack2.pop();
        }
        return compare1.equals(compare2);



    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        backspaceCompare(s,t);


    }
}
