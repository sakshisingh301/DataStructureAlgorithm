package com.company.AlgorthmII;

public class SortColors {

    public void sortColors(int[] nums) {
        int p0=0;
        int p2=nums.length-1;
        int curr=0;

        while(curr>=p2)
        {
            if(nums[curr]==0)
            {
                int temp=nums[curr];
                nums[curr]=nums[p0];
                nums[p0]=temp;
                p0++;
                curr++;

            }
            if(nums[curr]==2)
            {
                int temp=nums[curr];
                nums[curr]=nums[p2];
                nums[p2]=temp;
                curr++;
                p2--;
            }
            if(nums[curr]==1)
            {

                curr++;
            }
        }

    }


    public static void main(String[] args) {
        int []  nums = {2,0,2,1,1,0};

    }
}
