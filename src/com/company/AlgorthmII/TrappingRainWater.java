package com.company.AlgorthmII;

public class TrappingRainWater {



    //idea is to find the maxleft and maxright , find math.min(maxleft,maxright)-height{current]

    //optimised will be using 2 pointer
    public static int trap(int[] height) {
        int left=0;
        int right=height.length-1;

        int maxLeft=height[left];
        int  maxRight=height[right];
        int result=0;

        while(left<right)
        {
            if(maxLeft<=maxRight)
            {
                left++;
                maxLeft=Math.max(maxLeft,height[left]);
                result=result+maxLeft-height[left];
            }
            else {
                right--;
                maxRight=Math.max(maxLeft,height[right]);
                result=result+maxRight-height[right];
            }
        }
  return  result;


    }

    public static void main(String[] args) {

        int [] height={0,1,0,2,1,0,1,3,2,1,2,1};

    }
}
