package com.company.Arrays;

public class RemoveElementLeetcode {

    public static int solve(int [] nums,int val)
    {
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;)
        {
            if(nums[i]==val)
            {
              i++;
            }
            else {
                nums[j]=nums[i];
                j++;
                i++;
                count++;
            }
        }
     return count;
    }

    public static void main(String[] args) {
        int [] a={0,1,2,2,3,0,4,2};
        int val=2;
        solve(a,val);
    }
}
