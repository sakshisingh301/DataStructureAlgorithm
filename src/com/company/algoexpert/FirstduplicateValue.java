package com.company.algoexpert;

import java.util.HashSet;

public class FirstduplicateValue {
    public int firstDuplicateValue(int[] array) {
        HashSet<Integer> hashSet=new HashSet<>();
        int result=0;

        for(int i=0;i< array.length;i++)
        {
            if(!hashSet.contains(array[i]))
            {
                hashSet.add(array[i]);
            }
            else {
                result=array[i];
                break;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int [] a={2,1,5,2,3,3,4};

    }
}
