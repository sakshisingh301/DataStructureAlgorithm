package com.company.algorithmI;

public class SquaresofaSortedArray {

    public int[] sortedSquares(int[] nums) {

        int [] temp=new int[nums.length];
        int k=nums.length-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int num1=nums[start]*nums[start];
            int num2=nums[end]*nums[end];
            if(num1<num2)
            {
                temp[k]=num2;
                end--;
                k--;
            }
            else
            {
                temp[k]=num1;
                start++;
                k--;
            }
        }
        return temp;

    }

    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
    }
}
