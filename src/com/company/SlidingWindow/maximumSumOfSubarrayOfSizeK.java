package com.company.SlidingWindow;

public class maximumSumOfSubarrayOfSizeK {
    public static int solution(int [] a , int k)
    {
      int j=0;
      int i=0;
      int sum=0;
      int max=0;

      while(j<a.length)
      {
        sum=sum+a[j];
       if(j-i+1<k)
       {
           j++;
       }
       else if(j-i+1==k)
       {
           if(sum>max)
           {
               max=sum;
           }
           sum=sum-a[i];
           j++;
           i++;

       }
      }
      return max;
    }

    public static void main(String[] args) {
        int [] a={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;
        System.out.println(solution(a,k));

    }
}
