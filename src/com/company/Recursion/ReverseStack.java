package com.company.Recursion;

import java.util.Stack;

public class ReverseStack {

    public static Stack<Integer> reverse(Stack<Integer> stack)
    {
        if(stack.size()==0 || stack.size()==1)
            return stack;
        int temp=stack.pop();
        stack=reverse(stack);
        insert(stack,temp);
        return stack;
    }

    private static void insert(Stack<Integer> stack, int temp) {

        if(stack.size()==0) {
            stack.push(temp);
            return;
        }
        int val=stack.pop();
        insert(stack,temp);
        stack.push(val);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(reverse(s));

    }
}
