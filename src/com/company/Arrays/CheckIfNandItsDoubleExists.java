package com.company.Arrays;

public class CheckIfNandItsDoubleExists {

    public static boolean solution(int [] arr)
    {

        for(int i=0;i<arr.length;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]==arr[i]/2 || arr[j]==arr[i]*2)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {3,1,7,11};
        System.out.println(solution(arr));
    }
}
