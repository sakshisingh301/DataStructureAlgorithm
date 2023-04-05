package com.company.Arrays;

public class SortArrayByParity {

    public static int [] solve(int [] nums)
    {

        int j=0;
        int i=0;
        while(i<nums.length && j<nums.length)
        {
          if(nums[j]%2!=0)
          {
              j++;
          }
          else {
              int temp=nums[i];
              nums[i]=nums[j];
              nums[j]=temp;
              i++;
              j++;
          }
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] arr={3,1,2,4};
        solve(arr);
    }
}
