package com.company.companyWise.expedia;

import java.util.Stack;

class MinStack {
 Stack<Integer> stack=new Stack<>();
 Stack<Integer> minValStack=new Stack<>();


    public MinStack() {

    }

    public void push(int val) {


        if(minValStack.isEmpty() || minValStack.peek()>=val)
        {
            minValStack.push(val);
        }
        stack.push(val);

    }

    public void pop() {

        if(!minValStack.isEmpty() && minValStack.peek().equals(stack.peek()))
        {
          minValStack.pop();
        }
        stack.pop();

    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return minValStack.peek();

    }
}
