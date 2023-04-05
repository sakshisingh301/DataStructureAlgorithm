package com.company.Arrays;

public class MaxConsecutiveOne {
    public static int solve(int [] nums)
    {
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;)
        {
            if(nums[i]==1) {
                while ( i<nums.length && nums[i] != 0 ) {
                    count++;
                    i++;

                }
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
            else {
                i++;
            }

        }
        return maxCount;
    }

    public static void main(String[] args) {
        int [] a={1,1,0,1,1,1};
        solve(a);

    }
}
