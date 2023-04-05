package com.company.AlgorthmII;

public class SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int i=0;
        int j=0;
        int product=1;

        while(j<nums.length)
        {
            product=product*nums[j];

            while(j>=i &&product>k)
            {
                product=product/nums[i];
                i++;
            }
           count=count+(j-i+1);
            j++;
        }
        return count;

    }

    public static void main(String[] args) {
       int [] nums = {10,5,2,6};
       int k = 100;

    }
}
