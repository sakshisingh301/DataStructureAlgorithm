package com.company.Stack;

import java.util.Arrays;
import java.util.Stack;

public class DupllicateLetters {

    public static int findIndex(char [] a, char c )
    {
        int index=-1;
        for(int i=0;i<a.length;i++)
        {
           if(a[i]==c)
           {
               index=i;
               break;
           }
        }
        return index;
    }

    public static String removeDuplicateLetters(String s) {
        StringBuilder result=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        int [] characterPresent=new int[26];
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int [] lastIndex=new int[26];

        //finding last index of the letter
        for(int i=0;i<s.length();i++)
        {

            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for(int i=0;i<s.length();i++)
        {

            if(stack.isEmpty())
            {
                stack.push(s.charAt(i));
                int index=findIndex(alphabet,s.charAt(i));
                characterPresent[index]=1;

            }
            else
            {
                int index1=findIndex(alphabet,s.charAt(i));
             while( !stack.isEmpty()&& s.charAt(i)<stack.peek() && characterPresent[index1]==0 && lastIndex[findIndex(alphabet,stack.peek())]>i  )
             {
                 int index=findIndex(alphabet,stack.peek());
                 characterPresent[index]=0;
                 stack.pop();
             }
             if(characterPresent[i]==0 && characterPresent[index1]==0) {
                 stack.push(s.charAt(i));
                 int index = findIndex(alphabet, s.charAt(i));
                 characterPresent[index] = 1;
             }

            }
        }
        while(!stack.isEmpty())
        {
          result.append(stack.pop());
        }

        StringBuilder input1 = new StringBuilder();
        input1.append(result);
        input1.reverse();
        return String.valueOf(input1);


    }

    public static void main(String[] args) {
        String s = "ecbacba";
        removeDuplicateLetters(s);


    }
}
