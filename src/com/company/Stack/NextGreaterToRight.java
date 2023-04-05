package com.company.Stack;

import java.util.*;

public class NextGreaterToRight {

    public static List<Integer> solution(int [] a)
    {
        Stack<Integer> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        for (int i=a.length-1;i>=0 ; i--)
        {
            if(stack.isEmpty())
            {
                list.add(-1);
                stack.push(a[i]);

            }
            else
            {
            while(!stack.isEmpty() &&a[i]>stack.peek())
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                list.add(-1);
            }
            if(!stack.isEmpty()) {
                list.add(stack.peek());
                stack.push(a[i]);
            }

            }

        }
        Collections.reverse(list);
        return list;
    }

//    public static int[] nextGreaterElement(int[] array) {
//
//        Stack<Integer> stack=new Stack<>();
//        int k=0;
//        boolean noElementFound=true;
//        boolean lastElementsRange=true;
//        int [] list=new int[array.length];
//        for (int i=array.length-1;i>=0 ; i--)
//        {
//         if(stack.isEmpty() || i==array.length-3 ||i==array.length-2)
//         {
//             if(i==array.length-2 || i==array.length-3)
//             {
//                 for(int m=i+1;m<array.length;m++)
//                 {
//                     if( m<array.length && array[i]<array[m])
//                     {
//                         list[k]=array[m];
//                         k++;
//                         stack.push(array[i]);
//                         lastElementsRange=false;
//                         break;
//
//                     }
//                 }
//             }
//             if(lastElementsRange) {
//                 for (int j = 0; j < array.length; j++) {
//                     if (array[i] < array[j]) {
//                         list[k] = array[j];
//                         k++;
//                         stack.push(array[i]);
//                         noElementFound = false;
//                         break;
//                     }
//                 }
//                 if(noElementFound) {
//                     list[k] = -1;
//                     k++;
//                     stack.push(array[i]);
//                 }
//             }
//
//
//         }
//         else {
//             while(!stack.isEmpty() && array[i]>=stack.peek())
//             {
//                 stack.pop();
//             }
//             if(stack.isEmpty())
//             {
//                 list[k]=-1;
//                 k++;
//             }
//             if(!stack.isEmpty())
//             {
//              list[k]=stack.peek();
//              k++;
//             }
//             stack.push(array[i]);
//
//         }
//
//        }
//       reverseArray(list);
//        return list;
//    }

    public static int[] nextGreaterElement(int[] array) {
        int [] result=new int[array.length];
        Stack<Integer> stack=new Stack<>();
        int count=2;
        for(int i=0;i<array.length;i++)
        {
            result[i]=-1;
        }
        while (count>0) {
            for (int i = 0; i < array.length; i++) {
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    while ( !stack.isEmpty() &&array[i] > array[stack.peek()]) {
                        result[stack.peek()] = array[i];
                        stack.pop();
                    }
                    stack.push(i);
                }
            }
            count--;
        }
        return result;

    }

    public static void reverseArray(int [] a)
    {
        for(int i = 0; i < a.length / 2; i++)
        {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }


    public static void main(String[] args) {
        int [] a={2, 5, -3, -4, 6, 7, 2};
        //solution(a);
        nextGreaterElement(a);


    }
}
