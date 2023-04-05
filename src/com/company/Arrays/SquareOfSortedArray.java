package com.company.Arrays;

public class SquareOfSortedArray {
 //two pointer
    public static int [] solve(int [] nums)
    {
       int [] temp=new int[nums.length];
       int i=nums.length-1;
       int start=0;
       int end=nums.length-1;
       while(start<=end)
       {
           if((nums[start]*nums[start]) <=(nums[end]*nums[end]))
           {
             temp[i]= nums[end]*nums[end];
             i--;
             end--;
           }
           else if((nums[start]*nums[start]) >(nums[end]*nums[end]))
           {
               temp[i]=nums[start]*nums[start];
               i--;
               start++;
           }
       }

        return temp;
    }

    public static void main(String[] args) {
        int [] a={-4,-1,0,3,10};
        solve(a);
    }
}
