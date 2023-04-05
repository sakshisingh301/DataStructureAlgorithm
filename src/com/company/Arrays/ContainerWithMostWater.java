package com.company.Arrays;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int first=height[0];
        boolean allsame=true;
        for (int i=1;i<height.length;i++)
        {
            if(height[i]!=first)
            {
                allsame=false;
            }

        }
        if(allsame)
        {
          return first;
        }
        int start=0;
        int end=height.length-1;
        int area=0;
        int maxArea=0;
        while(start<end)
        {
         if(height[start]<height[end])
         {
             area=height[start] *(height[end]-height[start]);
             if(area>maxArea)
                 maxArea=area;
             start++;
         }
         else if(height[start]>height[end])
         {
             area=height[end]*(end-start);
             if(area>maxArea)
                 maxArea=area;
             end--;

         }
         else
         {
             area=height[start]*height[end];
             if(area>maxArea)
                 maxArea=area;
             start++;
             end--;
         }

        }
        return maxArea;

    }

    public static void main(String[] args) {
        int [] a={1,8,6,2,5,4,8,3,7};
        maxArea(a);
    }
}
