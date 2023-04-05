package com.company.Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation1 {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack=new Stack<>();


        for(int i=0;i<tokens.length;i++)
        {
            String currentChars=tokens[i];
            if(!"+-*/".contains(currentChars))
            {
                stack.push(Integer.valueOf(currentChars));
                continue;
            }


            int result=0;
                int num1=stack.pop();
                int num2=stack.pop();
            switch (currentChars) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            stack.push(result);

            }



        return stack.pop();


    }

    public static void main(String[] args) {
        String [] tokens = {"4","13","5","/","+"};
        evalRPN(tokens);
    }
}
