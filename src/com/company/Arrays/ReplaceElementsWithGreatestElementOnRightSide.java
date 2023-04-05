package com.company.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {


    public static int [] solve(int [] a)
    {
        int [] temp=new int[a.length];
        int j=a.length-1;
        int max_so_far=0;
        for(int i=a.length-1;i>=0;i--)
        {
            if(i==a.length-1)
            {
                temp[j]=-1;
                max_so_far=a[i];
                j--;
            }
            else {
                temp[j]=max_so_far;
                if(a[i]>max_so_far)
                {
                    max_so_far=a[i];
                }
                j--;
            }

        }
        return temp;

    }

    public static void main(String[] args) {
        int [] a={17,18,5,4,6,1};
        solve(a);
    }
}
