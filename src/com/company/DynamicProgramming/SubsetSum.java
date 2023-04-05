package com.company.DynamicProgramming;

public class SubsetSum {

    public static boolean solve(int [] set,int sum)
    {
        int n=set.length;
        boolean [] [] dp=new boolean[n+1][sum+1];

        for(int i=0;i< dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(j==0)
                {
                    dp[i][j]=true;
                }
                if(i==0)
                {
                    dp[i][j]=false;
                }
            }
        }

        for(int i=1;i< dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++) {

                if(set[i-1]<=j)
                {
                   dp[i][j]=dp[i-1][j-set[i-1]] || dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }

            }

        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
       int  set[] = {3, 34, 4, 12, 5, 2};
       int sum = 30;
       System.out.println(solve(set,sum));
    }
}
