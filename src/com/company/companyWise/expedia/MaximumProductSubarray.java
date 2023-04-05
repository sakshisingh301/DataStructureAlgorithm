package com.company.companyWise.expedia;

public class MaximumProductSubarray {
     // kadane's algo
    public static int maxProduct(int[] nums) {

      int maxRes=nums[0];
      int maxProduct=nums[0];
      int minProduct=nums[0];

      for(int i=1;i<nums.length;i++)
      {
          if(nums[i]>=0)
          {
              maxProduct=Math.max(maxProduct * nums[i],nums[i]);
              minProduct=Math.min(minProduct*nums[i],nums[i]);
          }
          else {
              int temp=maxProduct;
              maxProduct=Math.max(maxProduct*nums[i],nums[i]);
              minProduct=Math.min(temp*nums[i],nums[i]);

          }
          maxRes=Math.max(maxProduct,maxRes);
      }
      return maxRes;
    }

    public static void main(String[] args) {

        int [] nums = {2,3,-2,4};
        maxProduct(nums);

    }
}
