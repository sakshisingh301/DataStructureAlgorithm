package com.company.Arrays;

public class MergeSortedArrays {

    public static void solve(int[] num1,int [] num2 ,int m,int n)
    {
      int p1=m-1;
      int p2=n-1;
      int i=m+n-1;
      while(p2>=0)
      {
          if(num1[p1]< num2[p2])
          {
              num1[i]=num2[p2];
              i--;
              p2--;
          }
          else
          {
              num1[i]=num1[p1];
              p1--;
              i--;

          }
      }
    }
    public static void main(String[] args) {
        int [] num1={1,2,3,0,0,0};
        int [] num2={2,5,6};
        solve(num1,num2,3,3);
    }
}
