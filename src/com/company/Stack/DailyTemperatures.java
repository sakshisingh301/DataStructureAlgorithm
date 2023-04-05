package com.company.Stack;

import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        int [] result=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<temperatures.length;i++)
        {
            int currentTemp=temperatures[i];


            while(!stack.isEmpty() && currentTemp>temperatures[stack.peek()])
            {
                int index=stack.pop();
                result[index]=i-index;

            }

          stack.push(i);

        }

  return result;
    }

    public static void main(String[] args) {
        int [] temperatures = {73,74,75,71,69,72,76,73};
        dailyTemperatures(temperatures);
    }
}
