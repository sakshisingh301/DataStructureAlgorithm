package com.company.leetcode.dsaseries;

import java.util.Stack;

public class NextGreaterelement2 {

    public static int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack=new Stack<>();

        int [] temp=new int[nums.length];
      for (int i=nums.length-1;i>=0;i--)
      {
          stack.push(nums[i]);
      }

      for(int i=nums.length-1;i>=0;i--)
      {
          int number=nums[i];
          while(!stack.isEmpty() &&number>=stack.peek())
          {
              stack.pop();
          }
          if(stack.isEmpty())
          {
              temp[i]=-1;
          }
          else {
              temp[i] = stack.peek();
          }
          stack.push(number);

      }
        return temp;


    }

    public static void main(String[] args) {
        int [] nums={1,2,3,4,3};
        nextGreaterElements(nums);

    }
}
