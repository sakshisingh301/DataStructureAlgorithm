package com.company.Arrays;

public class ValidMountainArrays {

    public static boolean validMountain(int [] arr)
    {
        int peak=0;
        boolean flag=true;
        for(int i=0;i<arr.length;)
        {
            if( i<arr.length-1 &&arr[i]<arr[i+1])
            {
                i++;
            }
            else {
                peak=arr[i];
                int j=i;
                while (j<arr.length-1)
                {
                    if(arr[j]>arr[j+1])
                    {
                        j++;
                    }
                    else {
                        flag=false;
                        break;
                    }
                }
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        int [] arr={0,3,2,1};
        System.out.println(validMountain(arr));


    }
}
