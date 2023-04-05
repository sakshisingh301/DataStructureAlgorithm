package com.company.companyWise.expedia;

public class pivotindex {

    public static int pivotIndex(int[] nums) {

        int [] sum=new int[nums.length];int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total=total+nums[i];
            sum[i]=total;
        }

        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<nums.length;i++)
        {
            leftsum=sum[i]-nums[i];
            rightsum=sum[sum.length-1]-sum[i];
            if(leftsum==rightsum)
            {
                return i;
            }
        }
        return -1;




    }

    public static void main(String[] args) {

        int [] nums = {1,7,3,6,5,6};

    }

}
