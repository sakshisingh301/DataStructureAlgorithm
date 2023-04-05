package com.company.DSA;

public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {


        int [] [] result=new int[n][n];
        int num=1;
        int last_row=n-1;
        int last_column=n-1;

        int k=0;
        int l=0;

        while(k<=last_row && l<=last_column)
        {


            for(int i=k;i<=last_column;i++)
            {
              result[k][i]=num;
              num++;
            }
            k++;

            for(int i=k;i<=last_row;i++)
            {
                result[i][last_column]=num;
                num++;
            }
            last_column--;

            if(k<=last_row)
            {

                for(int i=last_column;i>=l;i--)
                {
                    result[last_row][i]=num;
                    num++;
                }
                last_row--;
            }

            if(l<=last_column)
            {
                for(int i=last_row;i>=k;i--)
                {
                    result[i][l]=num;
                    num++;
                }
                l++;

            }
        }
        return result;



    }

    public static void main(String[] args) {
        int n=3;
        generateMatrix(n);
    }
}
