package com.company.Arrays;

public class PeakElement {

    public static int solution(int [] arr)
    {
        if(arr.length==1)
        {
            return 1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int j=i+1;
            if( j<arr.length-1 && arr[j+1]<arr[j] && arr[i]<arr[j])
            {
                return arr[j];
            }
            if(i==arr.length-1)
            {
                if(arr[i-1]<arr[i])
                {
                    return i;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]= {15};
        System.out.println(solution(array));

    }
}
