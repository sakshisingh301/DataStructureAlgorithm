package com.company.Recursion;

import java.util.Stack;

public class DeleteMiddleElement {

    public static void naive(Stack<Character> stack)
    {
        int stackSize= stack.size()/2;
        Stack<Character> tempStack=new Stack<>();
        int count=0;
        while (stack.size()>0 && count !=stackSize+1)
        {
            tempStack.push(stack.pop());
            count++;

        }
        tempStack.pop();
        while(!tempStack.isEmpty())
        {
            stack.push(tempStack.pop());
        }


    }

    public static Stack<Character> recursion(Stack<Character> stack)
    {
        if(stack.size()==0)
            return stack;
       int mid=(stack.size()/2) +1;
       removeElement(stack,mid);
       return stack;

    }

    private  static void removeElement(Stack<Character> stack, int mid) {
        if(mid==1) {
            stack.pop();
            return;
        }
        char temp=stack.pop();
        removeElement(stack,mid-1);
        stack.push(temp);

    }


    public static void main(String[] args) {
        Stack<Character> st =
                new Stack<Character>();


        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');
        System.out.println(recursion(st));


    }
}
