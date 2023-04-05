package com.company.studyplanLeetcode;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();



    public void push(int x) {
        stack1.push(x);

    }

    public int pop() {

        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        int ans=stack2.pop();
        while(!stack2.isEmpty())
        {
            stack1.push(stack1.pop());
        }
        return ans;

    }

    public int peek() {
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        int ans=stack2.peek();
        while(!stack2.isEmpty())
        {
            stack1.push(stack1.pop());
        }
        return ans;


    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();

    }


    public static void main(String[] args) {

    }
}
