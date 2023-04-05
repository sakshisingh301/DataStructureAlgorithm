package com.company.studyplanLeetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision1 {
//    public static int[] asteroidCollision(int[] asteroids) {
//        List<Integer> list=new ArrayList<>();
//        boolean status=false;
//        Stack<Integer> stack=new Stack<>();
//        int i=0;
//        while (i<asteroids.length)
//        {
//            stack.push(asteroids[i]);
//           if(stack.size()>1 &&asteroids[i]<0 )
//           {
//              int temp=stack.pop();
//              if(stack.peek()<0) {
//                  stack.push(temp);
//
//              }
//
//
//               if(stack.peek()>0 &&stack.peek()<=Math.abs(temp) )
//               {
//
//                   while(stack.size()>0 &&stack.peek()<=Math.abs(temp)) {
//                       stack.pop();
//                   }
//               }
//
//           }
//           i++;
//
//
//        }
//        while(!stack.isEmpty())
//        {
//            list.add(stack.pop());
//        }
//        int [] temp=new int[list.size()];
//        int j=0;
//        for(int k=list.size()-1; k>=0;k--)
//        {
//            temp[j]=list.get(k);
//            j++;
//        }
//
//return temp;
//
//    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<asteroids.length;i++)
        {
            while(stack.size()>0 && asteroids[i]<0 && stack.peek()>0)
            {
                int diff=asteroids[i]+stack.peek();
                if(diff>0)
                {
                    asteroids[i]=0;
                }
                else if(diff<0)
                {
                    stack.pop();
                }
                else
                {
                    asteroids[i]=0;
                    stack.pop();
                }
            }


            if(asteroids[i]!=0)
            {
                stack.push(asteroids[i]);
            }

        }
               while(!stack.isEmpty())
       {
            list.add(stack.pop());
       }
        int [] temp=new int[list.size()];
        int j=0;
        for(int k=list.size()-1; k>=0;k--)
       {
            temp[j]=list.get(k);
            j++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int [] asteroids = {10,2,-5};
        asteroidCollision(asteroids);
    }
}
