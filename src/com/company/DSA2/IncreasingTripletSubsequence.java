package com.company.DSA2;

public class IncreasingTripletSubsequence {

    public static boolean increasingTriplet(int[] nums) {

        int first_num=Integer.MAX_VALUE;
        int second_num=Integer.MAX_VALUE;
        for(int x: nums)
        {
            if(x<=first_num)
            {
                first_num=x;
            }
            else if(x<=second_num)
            {
                second_num=x;
            }
            else
            {
                return true;
            }
        }
        return false;



    }

    public static void main(String[] args) {

      int [] nums = {1,2,3,4,5};
      System.out.println(increasingTriplet(nums));

    }
}
