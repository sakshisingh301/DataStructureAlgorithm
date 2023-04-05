package com.company.Arrays;

public class SortAnArraySorted {
    public static int solution(int [] nums)
    {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
          if(i==0)
          {
            nums[j]=nums[i];
            j++;
          }
          else  if(nums[j-1]!=nums[i])
          {
              nums[j]=nums[i];
              j++;
          }
        }
         return j;
    }

    public static void main(String[] args) {
        int [] arr={0,0,1,1,1,2,2,3,3,4};
        solution(arr);
    }
}
