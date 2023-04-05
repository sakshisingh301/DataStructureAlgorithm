package com.company.Arrays;

public class FindNumberswithEvenNumberofDigits {

    public static int solve(int [] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]>=10 && nums[i]<=99 || nums[i]>=1000 && nums[i]<=9999)
          {
              count++;
          }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] a={12,345,2,6,7896};
        solve(a);
    }
}
