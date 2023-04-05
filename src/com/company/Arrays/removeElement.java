package com.company.Arrays;

public class removeElement {

    public static void solution(int [] nums,int val)
    {
        for(int i=0;i<nums.length;)
        {
            if(nums[i]==val)
            {
                moveElement(nums,i);
            }
            if(nums[i]!=val)
            {
                i++;
            }

        }

    }

    private static void moveElement(int[] nums, int index) {
        for(int i=index;i<nums.length-1;i++ )
        {
            nums[i] = nums[i + 1];
        }
        nums[nums.length-1]=0;
    }

    public static void main(String[] args) {
       int [] nums = {0,1,2,2,3,0,4,2};
       int val=2;
       solution(nums,val);
       for(int i=0;i<nums.length;i++)
       {
           System.out.println(nums[i]);
       }
    }
}
