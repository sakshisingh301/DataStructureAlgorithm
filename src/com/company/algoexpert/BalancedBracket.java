package com.company.algoexpert;

import java.util.Stack;

public class BalancedBracket {

    public static boolean balancedBrackets(String str) {
        boolean isbalancedBrackets=false;
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<str.length();i++)
        {
            if(i==0 && str.charAt(i)==')')
            {
                return false;
            }
            if(str.charAt(i)=='('|| str.charAt(i)=='{' || str.charAt(i)=='[')
            {
                stack.push(str.charAt(i));
            }
            else if(!stack.isEmpty() && str.charAt(i)==')' && stack.peek()=='(' ||!stack.isEmpty() && str.charAt(i)=='}' && stack.peek()=='{'|| !stack.isEmpty() && str.charAt(i)==']' && stack.peek()=='[')
            {
                stack.pop();
            }
            else if(!stack.isEmpty() && str.charAt(i)==')' && stack.peek()!='(' ||!stack.isEmpty() && str.charAt(i)=='}' && stack.peek()!='{'|| !stack.isEmpty() && str.charAt(i)==']' && stack.peek()!='[')
            {
                break;
            }
        }
        if(stack.isEmpty())
        {
            isbalancedBrackets=true;
        }
       return isbalancedBrackets;
    }

    public static void main(String[] args) {
        String s=")[]}";
        balancedBrackets(s);

    }
}
