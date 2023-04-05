package com.company.String;

import java.util.ArrayList;
import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence)
    {
        boolean isSubsequence=false;
        int j=0;
        int i=0;
       while(j<array.size())
       {
           if(!array.get(j).equals(sequence.get(i)))
           {

               j++;
           }
           else
           {
             i++;
             j++;
           }
           if(i== sequence.size())
           {
               break;
           }
       }

       if(i==sequence.size())
       {
           isSubsequence=true;
       }
       return isSubsequence;
    }

    public static void main(String[] args) {
        List<Integer> array=new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);

        List<Integer> subsequence=new ArrayList<>();
        subsequence.add(22);
        subsequence.add(25);
        subsequence.add(6);

        isValidSubsequence(array,subsequence);


    }
}
