package com.company.Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
//idea is find next greater element to left and do this [NEXTGREATEREELEMENTTOLEFT-INDEX]
public class StockSpan {
    public static int[] calculateSpan(int price[], int n)
    {

        ArrayList<Integer> nearestGreaterToLeft=new ArrayList<>();
        ArrayList<Integer> index=new ArrayList<>();
        ArrayList<Integer> tempIndex=new ArrayList<>();
        int k=0;

        int [] result=new int[price.length];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<price.length;i++)
        {
            if(stack.isEmpty())
            {
                nearestGreaterToLeft.add(-1);

                stack.push(price[i]);
                index.add(i);

            }
            else
            {
            while(price[i]>stack.peek())
            {
                stack.pop();
                index.remove(index.size()-1);
            }
             nearestGreaterToLeft.add(index.get(index.size()-1));
             stack.push(price[i]);
             index.add(i);


            }

        }

        for(int i=0;i<n;i++)
        {
            tempIndex.add(i);
        }

        for(int i=0;i<nearestGreaterToLeft.size();i++ )
        {
            result[k]=tempIndex.get(i)-nearestGreaterToLeft.get(i);
            k++;
        }

        return result;
    }


    public static void main(String[] args) {
        int [] a={100, 80, 60, 70, 60, 75, 85};
        calculateSpan(a,7);
    }
}
