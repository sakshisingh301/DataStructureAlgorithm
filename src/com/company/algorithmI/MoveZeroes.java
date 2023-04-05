package com.company.algorithmI;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int count=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[k]=nums[i];
                k++;
                count++;
            }
        }

        for(int i=count;i<nums.length;i++)
        {
            nums[count]=0;
            count++;
        }

    }

    public static void main(String[] args) {
        int [] nums={0,1,0,3,12};
    }
}
