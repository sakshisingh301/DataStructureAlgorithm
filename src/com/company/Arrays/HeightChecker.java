package com.company.Arrays;

import java.util.Arrays;

public class HeightChecker {

    public static int solve(int [] a)
    {
        int [] temp=new int[a.length];

        for(int i=0;i<a.length;i++)
        {
            temp[i]=a[i];
        }
        Arrays.sort(a);
        int height=0;
        int original=0;
        int sorted=0;
        while (original<a.length || sorted<a.length)
        {
            if(a[original]!=temp[sorted])
            {
                height++;
            }
            original++;
            sorted++;
        }
       return height;

    }

    public static void main(String[] args) {
        int [] a={1,1,4,2,1,3};
        solve(a);
    }
}
