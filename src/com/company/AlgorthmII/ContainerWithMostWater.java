package com.company.AlgorthmII;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=Integer.MIN_VALUE;
        while(start<=end)
        {
            int width=end-start;
            max=Math.max(max,Math.min(height[start],height[end])*width);
           if(height[start]<=height[end])
           {
              start++;

           }
           else
           {
               end--;
           }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};

    }
}
