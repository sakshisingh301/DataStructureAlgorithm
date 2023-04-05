package com.company.SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FirstNegativeIntegerInWindowOfSizeK {

    public static ArrayList<Integer> solution(int [] a, int k)
    {
        int i=0;
        int j=0;
        int count=0;

        Stack<Integer> queue=new Stack<>();
        ArrayList<Integer> result=new ArrayList<>();

        while(j<a.length) {
            if (a[j] < 0) {
                queue.add(a[j]);
               // count++;
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                boolean loop=false;
                if(!queue.isEmpty() ) {
                    int element= queue.peek();
                    result.add(element);
                }
//                if(!queue.isEmpty() && count==0 ) {
//
//                    result.add(0);
//                }
                i++;
                j++;


            }



        }
        return  result;
    }

    public static void main(String[] args) {
        int [] a={-8, 2, 3, -6, 10};
        int k=2;
        solution(a,k);
    }
}
