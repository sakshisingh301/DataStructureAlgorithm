package com.company.leetcode.dsaseries;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateArray {

    public static void rotate(int[] nums, int k) {

      int [] temp=new int [nums.length];


      for(int i=0;i< nums.length;i++)
      {
          if(i+k<nums.length) {
              temp[i+k] = nums[i ];
          }
          else
          {
              int index=(i+k)%nums.length;
              temp[index]=nums[i];
          }

      }
      for(int i=0;i<nums.length;i++)
      {
          nums[i]=temp[i];
      }


    }


    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);


    }
}
