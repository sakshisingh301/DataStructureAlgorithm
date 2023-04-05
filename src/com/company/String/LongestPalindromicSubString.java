package com.company.String;

public class LongestPalindromicSubString {
    public static String longestPalindrome(String s) {

        int maxLength=0;
        String result="";
        int[][] dp = new int[s.length()][s.length()];
        for(int diff=0;diff<s.length();diff++ )
        {
            for(int i=0, j=i+diff;j<s.length();i++,j++)
            {
                if(i==j)
                {
                    dp[i][j]=1;
                }
                else if(diff==1)
                {
                    dp[i][j]=(s.charAt(i)==s.charAt(j))?2:0;
                }
                else
                {
                    if(s.charAt(i)==s.charAt(j) )
                    {
                        if( dp[i+1][j-1]>0)
                        {
                            dp[i][j]=dp[i+1][j-1]+2;
                        }

                    }
                }
                if(dp[i][j]!=0)
                {
                  if(j-i+1>maxLength)
                  {
                      maxLength=j-i+1;
                      result=s.substring(i,maxLength);
                  }

                }

            }
        }
  return result;
    }


    public static void main(String[] args) {
        String s="babad";
        System.out.println(s.substring(0,3));
        System.out.println(longestPalindrome(s));

    }
}
