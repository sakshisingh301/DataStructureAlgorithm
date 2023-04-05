package com.company.Recursion;

import java.util.Stack;
//concept is similar , base condition , hypothesis , induction
public class SortAnStack {

    public static void sort(Stack<Integer> stack)
    {
        if(stack.size()==1)
        {
          return ;  
        }
        int temp=stack.pop();
        sort(stack);
        insert(stack,temp);


    }

    private static void insert(Stack<Integer> stack, int temp) {
        if(stack.size()==1 || stack.peek()>temp )
        {
            stack.push(temp);
            return;
        }
        int val=stack.pop();
        insert(stack,temp);
        stack.push(val);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(5);
        s.push(18);
        s.push(14);
        s.push(3);

        sort(s);


    }
}
