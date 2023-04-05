package com.company.Arrays;

public class moveZeros {
    public static void solve(int [] a)
    {
        int count=0;
        int j=0;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[j]=a[i];
                j++;
                count++;
            }
        }
        for (int i=count;i<a.length;i++)
        {
            a[j]=0;
            j++;
        }
    }

    public static void main(String[] args) {
        int [] a={0,1,0,3,12};
        solve(a);
    }
}
