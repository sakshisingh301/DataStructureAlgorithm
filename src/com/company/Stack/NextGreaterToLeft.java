package com.company.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextGreaterToLeft {

    public static List<Integer> solution(int [] a)
    {
        Stack<Integer> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();

        for (int i=0;i<a.length;i++)
        {
            if(stack.isEmpty())
            {
                list.add(-1);
            }
            else
            {
                while(!stack.isEmpty() && a[i]>stack.peek())
                {
                    stack.pop();
                }
                if(!stack.isEmpty())
                list.add(stack.peek());
                if(stack.isEmpty())
                {
                    list.add(-1);
                }
            }
            stack.push(a[i]);
        }


        return list;
    }

    public static void main(String[] args) {
        int [] a={9, 4, 15, 6, 2, 10};
        solution(a);

    }
}
