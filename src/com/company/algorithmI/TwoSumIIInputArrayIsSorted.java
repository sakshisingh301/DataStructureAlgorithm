package com.company.algorithmI;

public class TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {

        int start=0;
        int end=numbers.length-1;

        while (start<end)
        {
            if(numbers[start]+numbers[end]>target)
            {
                end--;

            }
            else if(numbers[start]+numbers[end]<target)
            {
                start++;
            }
            else
            {
                return new int []{start+1,end+1};
            }
        }
        return null;



    }

    public static void main(String[] args) {
       int [] numbers = {2,7,11,15};
       int target = 9;

    }
}
